package Controladores;

import DAOs.DaoReserva;
import DTOs.ReservaDTO;
import DTOs.HabitacionDTO;
import Excepciones.HabitacionNoDisponibleExcepcion;
import Excepciones.HabitacionNoEncontradaExcepcion;
import Excepciones.HuespedNoEncontradoExcepcion;
import Excepciones.ReservaInvalidaExcepcion;
import Modelo.IDsGenerator;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;

/*
/este es el controlador mas importante ya que es el que coordina con otros controladores para hacer las 
/asociaciones necesarias con los demas controladores para tener una persistencia logica de datos y que se sincronicen
/correctamente.
 */
public class ControladorReserva {

    private final DaoReserva daoReserva;
    private final ControladorHuesped controladorHuesped;
    private final ControladorHabitacion controladorHabitacion;

    public ControladorReserva(ControladorHuesped controladorHuesped, ControladorHabitacion controladorHabitacion) {
        this.daoReserva = new DaoReserva();
        this.controladorHuesped = controladorHuesped;
        this.controladorHabitacion = controladorHabitacion;
    }

    public boolean registrarReserva(ReservaDTO reserva)
            throws ReservaInvalidaExcepcion, HabitacionNoDisponibleExcepcion,
            HuespedNoEncontradoExcepcion, HabitacionNoEncontradaExcepcion {

        validarReserva(reserva);

        HabitacionDTO habitacion = controladorHabitacion.buscarHabitacion(reserva.getIdHabitacion());

        if (!habitacion.getEstado().equalsIgnoreCase("Libre")) {
            throw new HabitacionNoDisponibleExcepcion("La habitación no está disponible.");
        }

        String idGenerado = IDsGenerator.generateReservaId();
        reserva.setIdReserva(idGenerado);

        boolean registrada = daoReserva.guardarReserva(reserva);

        if (registrada) {
            controladorHabitacion.actualizarEstadoHabitacion(reserva.getIdHabitacion(), "Ocupada");
        }

        return registrada;
    }

    public boolean eliminarReserva(String idReserva) throws ReservaInvalidaExcepcion {
        ReservaDTO reserva = daoReserva.buscarReserva(idReserva);

        if (reserva == null) {
            throw new ReservaInvalidaExcepcion("La reserva no existe.");
        }

        boolean eliminada = daoReserva.eliminarReserva(idReserva);

        if (eliminada) {
            try {
                controladorHabitacion.actualizarEstadoHabitacion(reserva.getIdHabitacion(), "Disponible");
            } catch (HabitacionNoEncontradaExcepcion e) {

            }
        }
        return eliminada;
    }

    public ReservaDTO buscarReserva(String idReserva) throws ReservaInvalidaExcepcion {
        ReservaDTO reserva = daoReserva.buscarReserva(idReserva);
        if (reserva == null) {
            throw new ReservaInvalidaExcepcion("Reserva no encontrada.");
        }
        return reserva;
    }

    public DefaultTableModel obtenerTablaReservas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"ID", "Fecha Entrada", "Fecha Salida", "ID Huésped", "Habitación"});

        for (ReservaDTO r : daoReserva.getListaReservas()) {
            modelo.addRow(new Object[]{
                r.getIdReserva(),
                r.getFechaEntrada(),
                r.getFechaSalida(),
                r.getIdHuesped(),
                r.getIdHabitacion()
            });
        }
        return modelo;
    }

    public DefaultTableModel ReservasPorHuesped(int idHuesped) {
        String[] columnas = {"ID Reserva", "Número Habitación", "Fecha entrada", "Fecha salida"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (ReservaDTO reserva : daoReserva.getListaReservas()) {
            if (reserva.getIdHuesped() == idHuesped) {
                modelo.addRow(new Object[]{
                    reserva.getIdReserva(),
                    reserva.getIdHabitacion(),
                    reserva.getFechaEntrada(),
                    reserva.getFechaSalida()
                });
            }
        }

        return modelo;
    }
    
    //Validaciones necesarias para el buen flujo de la aplcacion y no tenga posibles fallos de ejecucion.
    private void validarReserva(ReservaDTO reserva) throws ReservaInvalidaExcepcion, HuespedNoEncontradoExcepcion, HabitacionNoEncontradaExcepcion {

        LocalDate entrada = reserva.getFechaEntrada();
        LocalDate salida = reserva.getFechaSalida();

        if (entrada == null || salida == null) {
            throw new ReservaInvalidaExcepcion("Las fechas no pueden ser nulas.");
        }

        if (!entrada.isBefore(salida)) {
            throw new ReservaInvalidaExcepcion("La fecha de entrada debe ser anterior a la fecha de salida.");
        }

        controladorHuesped.buscarHuesped(reserva.getIdHuesped());
        controladorHabitacion.buscarHabitacion(reserva.getIdHabitacion());
    }
}
