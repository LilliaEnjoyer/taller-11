public class Main {
    public static void main(String[] args) {
        ServicioNotificaciones servicio = new ServicioNotificaciones();

        servicio.enviarNotificacion("SMS", "Juan", "Tu transferencia de $50.000 fue exitosa.");
        servicio.enviarNotificacion("EMAIL", "Maria", "Recibiste un pago de $120.000.");
        servicio.enviarNotificacion("PUSH", "Carlos", "Tu saldo ha cambiado.");
        servicio.enviarNotificacion("WHATSAPP", "Ana", "Tu código de seguridad es 8492.");

        System.out.println("\nESPERADO: Notificaciones enviadas por SMS, EMAIL, PUSH y WHATSAPP sin bloques if/else.");
    }
}

