public class ServicioNotificaciones {
    public void enviarNotificacion(String canal, String usuario, String mensaje) {
        Notificacion notificacion = NotificacionFactory.crearNotificacion(canal);
        notificacion.enviar(usuario, mensaje);
    }
}
