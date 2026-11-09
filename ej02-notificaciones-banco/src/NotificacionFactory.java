public class NotificacionFactory {
    
    public static Notificacion crearNotificacion(String canal) {
        if (canal == null) {
            throw new IllegalArgumentException("El canal no puede ser nulo");
        }

        switch (canal.toUpperCase()) {
            case "SMS":
                return new Sms();
            case "EMAIL":
                return new Email();
            case "PUSH":
                return new Push();
            case "WHATSAPP":
                return new Whatsapp();
            default:
                throw new IllegalArgumentException("Canal de notificación no soportado: " + canal);
        }
    }
}
