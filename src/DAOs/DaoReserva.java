package DAOs;

import DTOs.ReservaDTO;
import java.util.ArrayList;

//clase dao para el acceso a los datos se utiliza principalmente para el crud y la reserva de datos en memoria o en BD.
public class DaoReserva {

    private final ArrayList<ReservaDTO> listaReservas;

    public DaoReserva() {
        this.listaReservas = new ArrayList<>();
    }

    public ArrayList<ReservaDTO> getListaReservas() {
        return listaReservas;
    }

    public boolean guardarReserva(ReservaDTO reserva) {
        if (reserva != null) {
            listaReservas.add(reserva);
            return true;
        }
        return false;
    }

    public ReservaDTO buscarReserva(String id) {
        for (ReservaDTO reserva : listaReservas) {
            if (reserva.getIdReserva().equals(id)) {
                return reserva;
            }
        }
        return null;
    }

    public boolean eliminarReserva(String id) {
        ReservaDTO reserva = buscarReserva(id);
        if (reserva != null) {
            listaReservas.remove(reserva);
            return true;
        }
        return false;
    }
}
