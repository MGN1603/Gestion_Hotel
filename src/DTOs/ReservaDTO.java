package DTOs;

import java.time.LocalDate;

//clase de tipo transferencia de datos para controlador y vista para no exponer la entidad completa.
public class ReservaDTO {

    private String idReserva;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private int idHuesped; //referencias a los objetos comlejos por medio de ids para su posible asociacion con estas clases.
    private int idHabitacion;

    public ReservaDTO(String idReserva, LocalDate fechaEntrada, LocalDate fechaSalida, int idHuesped, int idHabitacion) {
        this.idReserva = idReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.idHuesped = idHuesped;
        this.idHabitacion = idHabitacion;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    @Override
    public String toString() {
        return "Reserva #" + idReserva + " del huésped " + idHuesped;
    }
}
