package DTOs;

import java.time.LocalDate;

public class ReservaDTO {

    private int idReserva;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private int idHuesped;
    private int idHabitacion;

    public ReservaDTO(int idReserva, LocalDate fechaEntrada, LocalDate fechaSalida, int idHuesped, int idHabitacion) {
        this.idReserva = idReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.idHuesped = idHuesped;
        this.idHabitacion = idHabitacion;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
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
}
