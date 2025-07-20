package Modelo;

import java.time.LocalDate;

public class Reserva {
    
    //clase Reserva la mas importante de todas ya que es esta la cual tiene las asociaciones con un huesped y habitacion.
    private String idReserva;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Huesped huesped;
    private Habitacion habitacion;

    public Reserva(String idReserva, LocalDate fechaEntrada, LocalDate fechaSalida, Huesped huesped, Habitacion habitacion) {
        this.idReserva = idReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.huesped = huesped;
        this.habitacion = habitacion;
    }
    
    //Metodos Getters y Setters.
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

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}
