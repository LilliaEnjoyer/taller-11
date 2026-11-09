public class Whatsapp implements Notificacion {
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.println("Enviando mensaje por WhatsApp a " + usuario + ": " + mensaje);
    }
}
