package Controladores;

import DAOs.DaoHuesped;
import DTOs.HuespedDTO;
import Excepciones.HuespedExistenteExcepcion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControladorHuesped {

    private final DaoHuesped daoHuesped;

    public ControladorHuesped() {
        this.daoHuesped = new DaoHuesped();
    }

    public boolean guardarHuesped(HuespedDTO huesped) throws HuespedExistenteExcepcion {
        if (huesped == null) {
            throw new IllegalArgumentException("El propietario no puede ser null.");
        }

        if (daoHuesped.buscarHuesped(huesped.getDocumento()) != null) {
            throw new HuespedExistenteExcepcion("Ya existe un Huesped con ese N. documento.");
        }

        return daoHuesped.guardarHuesped(huesped);
    }

    public HuespedDTO buscarHuesped(int documento) throws HuespedExistenteExcepcion {
        HuespedDTO encontrado = daoHuesped.buscarHuesped(documento);
        if (encontrado == null) {
            throw new HuespedExistenteExcepcion("Huesped no encontrado con documento: " + documento);
        }
        return encontrado;
    }

    public boolean actualizarDatos(HuespedDTO actualizado) throws HuespedExistenteExcepcion {
        HuespedDTO actual = daoHuesped.buscarHuesped(actualizado.getDocumento());
        if (actual == null) {
            throw new HuespedExistenteExcepcion("No se puede actualizar: propietario no encontrado.");
        }

        return daoHuesped.actualizarDatos(actualizado);
    }

    public boolean eliminarPropietario(int documento) throws HuespedExistenteExcepcion {
        HuespedDTO actual = daoHuesped.buscarHuesped(documento);
        if (actual == null) {
            throw new HuespedExistenteExcepcion("No se puede eliminar: propietario no encontrado.");
        }
        return daoHuesped.eliminarHuesped(documento);
    }

    public DefaultTableModel obtenerTablaHuesped() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Documento", "Nombre","Teléfono", "Correo"});

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

}
