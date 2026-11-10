public class GeneradorTurnos {

    private static GeneradorTurnos instancia;
    private int consecutivo = 0;

    private GeneradorTurnos() {
    }

    public static synchronized GeneradorTurnos getInstance() {
        if (instancia == null) {
            instancia = new GeneradorTurnos();
        }
        return instancia;
    }
    
    public synchronized String siguienteTurno() {
        consecutivo++;
        return "T-" + String.format("%03d", consecutivo);
    }
}