package Modelo;

import java.util.ArrayList;

//clase huesped con sus atributos y una lista de sus reservas.
public class Huesped {

    private String nombre;
    private int documento;
    private String correo;
    private String telefono;
    private ArrayList<Reserva> reservas;

    public Huesped(String nombre, int documento, String correo, String telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.correo = correo;
        this.telefono = telefono;
        this.reservas = new ArrayList<>();
    }
    
    //Metodos Getters y Setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

}
