package DTOs;

public class HabitacionDTO {

    private int numero;
    private String tipo;
    private int capacidad;
    private String estado;
    private int idReserva;

    public HabitacionDTO(int numero, String tipo, int capacidad, String estado, int idReserva) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.estado = estado;
        this.idReserva = idReserva;
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

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
}
