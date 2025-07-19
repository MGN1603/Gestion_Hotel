package Modelo;

import java.util.ArrayList;

public class Habitacion {

    private int numero;
    private String tipo;
    private int capacidad;
    private String estado;
    private ArrayList<Reserva> listaReserva;

    public Habitacion(int numero, String tipo, int capacidad, String estado) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.estado = estado;
        this.listaReserva = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Reserva> getListaReserva() {
        return listaReserva;
    }

    public void setListaReserva(ArrayList<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
    }
}
