package DTOs;

//clase de tipo trasferencia de datos para no exponer la clase entidad completa.
public class HuespedDTO {

    private int documento;
    private String nombre;
    private String telefono;
    private String correo;

    public HuespedDTO(int documento, String nombre, String telefono, String correo) {
        this.documento = documento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return nombre + " (" + documento + ")";
    }
}
