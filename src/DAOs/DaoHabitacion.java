package DAOs;

import DTOs.HabitacionDTO;
import java.util.ArrayList;

//DAO para guardar los acceder a los datos de una lista de habitaciones.
public class DaoHabitacion {

    private final ArrayList<HabitacionDTO> habitaciones;

    public DaoHabitacion() {
        this.habitaciones = new ArrayList<>();
    }

    public ArrayList<HabitacionDTO> getHabitaciones() {
        return habitaciones;
    }

    public boolean guardarHabitacion(HabitacionDTO habitacion) {
        if (habitacion != null && buscarHabitacion(habitacion.getNumeroH()) == null) {
            habitaciones.add(habitacion);
            return true;
        }
        return false;
    }

    public HabitacionDTO buscarHabitacion(int numeroH) {
        for (HabitacionDTO habitacion : habitaciones) {
            if (habitacion.getNumeroH() == numeroH) {
                return habitacion;
            }
        }
        return null;
    }

    public boolean actualizarEstadoHabitacion(int idHabitacion, String nuevoEstado) {
        HabitacionDTO habitacion = buscarHabitacion(idHabitacion);
        if (habitacion != null) {
            habitacion.setEstado(nuevoEstado);
            return true;
        }
        return false;
    }

    public boolean eliminarHabitacion(int idHabitacion) {
        HabitacionDTO habitacion = buscarHabitacion(idHabitacion);
        if (habitacion != null) {
            habitaciones.remove(habitacion);
            return true;
        }
        return false;
    }
}
