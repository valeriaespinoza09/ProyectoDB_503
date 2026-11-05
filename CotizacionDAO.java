import java.util.ArrayList;

public class CotizacionDAO {
    private ArrayList<Cotizacion> lista = new ArrayList<>();

    public void agregar(Cotizacion c) {
        lista.add(c);
        System.out.println("Cotizacion guardada");
    }

    public void mostrar() {
        for (Cotizacion c : lista) {
            System.out.println(c.getCliente() + " - " + c.getTotal());
        }
    }
}
