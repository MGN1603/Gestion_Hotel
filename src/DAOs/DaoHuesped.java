package DAOs;

import DTOs.HuespedDTO;
import java.util.ArrayList;

//clase o capa necesaria para acceso a datos maneja principlaente el crud por medio de memoria
public class DaoHuesped {

    private ArrayList<HuespedDTO> huespedes;

    public DaoHuesped() {
        this.huespedes = new ArrayList<>();

    }

    public ArrayList<HuespedDTO> getHuespedes() {
        return huespedes;
    }

    public boolean guardarHuesped(HuespedDTO huesped) {
        if (huesped != null && buscarHuesped(huesped.getDocumento()) == null) {
            huespedes.add(huesped);
            return true;
        }
        return false;
    }

    public HuespedDTO buscarHuesped(int documento) {
        for (HuespedDTO huesped : huespedes) {
            if (huesped.getDocumento() == documento) {
                return huesped;
            }
        }
        return null;
    }

    public boolean actualizarDatos(HuespedDTO huesped) {
        HuespedDTO buscar = buscarHuesped(huesped.getDocumento());
        if (buscar != null) {
            buscar.setNombre(huesped.getNombre());
            buscar.setTelefono(huesped.getTelefono());
            buscar.setCorreo(huesped.getCorreo());
            return true;
        }
        return false;
    }

    public boolean eliminarHuesped(int documento) {
        HuespedDTO buscar = buscarHuesped(documento);
        if (buscar != null) {
            huespedes.remove(buscar);
            return true;
        }
        return false;
    }
}
