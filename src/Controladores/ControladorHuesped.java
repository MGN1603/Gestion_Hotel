package Controladores;

import DAOs.DaoHuesped;
import DTOs.HuespedDTO;
import Excepciones.HuespedExistenteExcepcion;
import Excepciones.HuespedNoEncontradoExcepcion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

//es el que gestiona la logica y las validaciones entre el modelo y la vista UI y maneja excepciones de negocio.
public class ControladorHuesped {

    private final DaoHuesped daoHuesped;

    public ControladorHuesped() {
        this.daoHuesped = new DaoHuesped();
    }

    public boolean guardarHuesped(HuespedDTO huesped) throws HuespedExistenteExcepcion {
        validarHuesped(huesped);

        if (daoHuesped.buscarHuesped(huesped.getDocumento()) != null) {
            throw new HuespedExistenteExcepcion("Ya existe un huésped con ese N. documento.");
        }

        return daoHuesped.guardarHuesped(huesped);
    }

    public HuespedDTO buscarHuesped(int documento) throws HuespedNoEncontradoExcepcion {
        HuespedDTO encontrado = daoHuesped.buscarHuesped(documento);
        if (encontrado == null) {
            throw new HuespedNoEncontradoExcepcion("Huésped no encontrado con documento: " + documento);
        }
        return encontrado;
    }

    public boolean actualizarDatos(HuespedDTO actualizado) throws HuespedExistenteExcepcion {
        validarHuesped(actualizado);

        HuespedDTO actual = daoHuesped.buscarHuesped(actualizado.getDocumento());
        if (actual == null) {
            throw new HuespedExistenteExcepcion("No se puede actualizar: huésped no encontrado.");
        }

        return daoHuesped.actualizarDatos(actualizado);
    }

    public boolean eliminarHuesped(int documento) throws HuespedExistenteExcepcion {
        HuespedDTO actual = daoHuesped.buscarHuesped(documento);
        if (actual == null) {
            throw new HuespedExistenteExcepcion("No se puede eliminar: huésped no encontrado.");
        }
        return daoHuesped.eliminarHuesped(documento);
    }

    public DefaultTableModel obtenerTablaHuesped() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Documento", "Nombre", "Teléfono", "Correo"});

        ArrayList<HuespedDTO> lista = daoHuesped.getHuespedes();

        for (HuespedDTO huesped : lista) {
            modelo.addRow(new Object[]{
                huesped.getDocumento(),
                huesped.getNombre(),
                huesped.getTelefono(),
                huesped.getCorreo()
            });
        }
        return modelo;
    }
    
    //Metodo privado pero necesario para hacer las validaciones necesarias para el buen flujo de la aplicacion.
    private void validarHuesped(HuespedDTO h) {
        if (h == null) {
            throw new IllegalArgumentException("El huésped no puede ser null.");
        }

        if (String.valueOf(h.getDocumento()).trim().isEmpty() || h.getDocumento() <= 0) {
            throw new IllegalArgumentException("El documento debe ser un número positivo.");
        }

        if (h.getNombre() == null || h.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }

        if (h.getTelefono() == null || !h.getTelefono().matches("\\d{7,}")) {
            throw new IllegalArgumentException("El teléfono debe tener al menos 7 dígitos.");
        }

        if (h.getCorreo() == null || !h.getCorreo().contains("@") || !h.getCorreo().contains(".")) {
            throw new IllegalArgumentException("El correo electrónico debe contener '@' y '.'.");
        }
    }
}
