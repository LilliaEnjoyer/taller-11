public class KioscoDigital {

    public void pedirTurno(String paciente) {
        String turno = GeneradorTurnos.getInstance().siguienteTurno();
        System.out.println("  [Kiosco] " + paciente + " -> " + turno);
    }
}