package DTOs;

//clase de tipo objeto de trasferencia con el objetivo de no exponer la entidad Habitacion.
public class HabitacionDTO {

    private int numeroH;
    private String tipo;
    private int capacidad;
    private String estado;
    private int idReserva;// se les pasa algun tipo de refencia al objeto no se maneja el objeto como tal.

    public HabitacionDTO(int numeroH, String tipo, int capacidad, String estado, int idReserva) {
        this.numeroH = numeroH;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.estado = estado;
        this.idReserva = idReserva;
    }

    //Metodos Getters y Setters.
    public int getNumeroH() {
        return numeroH;
    }

    public void setNumeroH(int numeroH) {
        this.numeroH = numeroH;
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

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    @Override
    public String toString() {
        return "Habitación " + numeroH + " - " + tipo;
    }
}
