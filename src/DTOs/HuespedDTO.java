package DTOs;

public class HuespedDTO {

    private String nombre;
    private int documento;
    private String correo;
    private String telefono;
    private String idReserva;

    public HuespedDTO(String nombre, int documento, String correo, String telefono, String idReserva) {
        this.nombre = nombre;
        this.documento = documento;
        this.correo = correo;
        this.telefono = telefono;
        this.idReserva = idReserva;
    }

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

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }
}
