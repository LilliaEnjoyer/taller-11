public class KioscoDigital {

    public void pedirTurno(String paciente) {
        // Usa la misma instancia compartida
        String turno = GeneradorTurnos.getInstance().siguienteTurno();
        System.out.println("  [Kiosco] " + paciente + " -> " + turno);
    }
}