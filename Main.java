public class Main {
    public static void main(String[] args) {
        TaquillaFisica taquilla = new TaquillaFisica();
        AppWeb app = new AppWeb();

        System.out.println("=== CineLibre: estreno, funcion 7:00 p.m., sala 1 ===");

        // 1. Boleta VIP completa por taquilla (Silla F7)
        taquilla.vender(Boleta.crearVipCompleta("Amazonas Perdido", "F7", "nachos"));

        // 2. Boleta de estudiante por la app (Silla F8)
        app.comprar(Boleta.crearEstudiante("Amazonas Perdido", "F8"));

        app.comprar(Boleta.crearNormal("Amazonas Perdido", "F7", "crispetas"));

        System.out.println();
        System.out.println("ESPERADO -> la boleta F8 sale con tarifa estudiante y sin VIP,");
        System.out.println("            y la segunda venta de F7 debe ser RECHAZADA");
    }
}