public class Ventanilla {

    private String nombre;

    public Ventanilla(String nombre) {
        this.nombre = nombre;
    }

    public void asignarTurno(String paciente) {
        // Usa la instancia compartida
        String turno = GeneradorTurnos.getInstance().siguienteTurno();
        System.out.println("  [" + nombre + "] " + paciente + " -> " + turno);
    }
}