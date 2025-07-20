package Controladores;

import DAOs.DaoHabitacion;
import DTOs.HabitacionDTO;
import Excepciones.HabitacionExistenteExcepcion;
import Excepciones.HabitacionNoEncontradaExcepcion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

//controlador el cual coordina los daos en este caso el de habitacion para el buen fujo de datos.
public class ControladorHabitacion {

    private final DaoHabitacion daoHabitacion;

    public ControladorHabitacion() {
        this.daoHabitacion = new DaoHabitacion();
    }

    public boolean registrarHabitacion(HabitacionDTO habitacion) throws HabitacionExistenteExcepcion {
        validarHabitacion(habitacion);

        if (daoHabitacion.buscarHabitacion(habitacion.getNumeroH()) != null) {
            throw new HabitacionExistenteExcepcion("Ya existe una habitacion con ese numero.");
        }

        return daoHabitacion.guardarHabitacion(habitacion);
    }

    public HabitacionDTO buscarHabitacion(int numero) throws HabitacionNoEncontradaExcepcion {
        HabitacionDTO encontrada = daoHabitacion.buscarHabitacion(numero);
        if (encontrada == null) {
            throw new HabitacionNoEncontradaExcepcion("No se encontro una habitacion con numero: " + numero);
        }
        return encontrada;
    }

    public boolean actualizarEstadoHabitacion(int numeroH, String nuevoEstado) throws HabitacionNoEncontradaExcepcion {
        if (daoHabitacion.buscarHabitacion(numeroH) == null) {
            throw new HabitacionNoEncontradaExcepcion("No se puede actualizar: habitacion no encontrada.");
        }
        return daoHabitacion.actualizarEstadoHabitacion(numeroH, nuevoEstado);
    }

    public boolean eliminarHabitacion(int numero) throws HabitacionNoEncontradaExcepcion {
        if (daoHabitacion.buscarHabitacion(numero) == null) {
            throw new HabitacionNoEncontradaExcepcion("No se puede eliminar: habitacion no encontrada.");
        }
        return daoHabitacion.eliminarHabitacion(numero);
    }

    public ArrayList<HabitacionDTO> obtenerHabitacionesDisponibles() {
        ArrayList<HabitacionDTO> todas = daoHabitacion.getHabitaciones();
        ArrayList<HabitacionDTO> disponibles = new ArrayList<>();

        for (HabitacionDTO habitacion : todas) {
            if ("Libre".equalsIgnoreCase(habitacion.getEstado())) {
                disponibles.add(habitacion);
            }
        }
        return disponibles;
    }

    public DefaultTableModel obtenerTablaHabitaciones() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Numero", "Tipo", "Capacidad", "Estado", "ID Reserva"});

        ArrayList<HabitacionDTO> lista = daoHabitacion.getHabitaciones();

        for (HabitacionDTO h : lista) {
            modelo.addRow(new Object[]{
                h.getNumeroH(),
                h.getTipo(),
                h.getCapacidad(),
                h.getEstado(),
                h.getIdReserva()
            });
        }

        return modelo;
    }
    
    //Metodo privado para las validaciones neceaarias para el registro de una habitacion.
    private void validarHabitacion(HabitacionDTO habitacion) {
        if (habitacion == null) {
            throw new IllegalArgumentException("La habitacion no puede ser null.");
        }

        if (habitacion.getTipo() == null || habitacion.getTipo().trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de habitacion no puede estar vacio.");
        }

        if (habitacion.getCapacidad() <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor a 0.");
        }

        if (habitacion.getEstado() == null || habitacion.getEstado().trim().isEmpty()) {
            throw new IllegalArgumentException("El estado no puede estar vacio.");
        }

        if (habitacion.getIdReserva() < 0) {
            throw new IllegalArgumentException("El ID de reserva no puede ser negativo.");
        }
    }
}
