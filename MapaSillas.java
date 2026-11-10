import java.util.ArrayList;

public class MapaSillas {

    private static MapaSillas instancia;
    private final ArrayList<String> ocupadas = new ArrayList<>();

    private MapaSillas() {}

    public static synchronized MapaSillas getInstancia() {
        if (instancia == null) {
            instancia = new MapaSillas();
        }
        return instancia;
    }

    public synchronized boolean reservar(String silla) {
        if (ocupadas.contains(silla)) {
            return false;
        }
        ocupadas.add(silla);
        return true;
    }
}