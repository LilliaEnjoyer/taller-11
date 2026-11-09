public class Main {
    public static void main(String[] args) {
        System.out.println("--- Viajes Andinos: paquetes vendidos ---");

        // p1: Paquete completo
        PaqueteViaje p1 = new PaqueteViaje.Builder("Cartagena", 4)
                .conVuelo(true)
                .conHotel("Decameron")
                .conDesayuno(true)
                .conTour("Islas del Rosario")
                .conSeguroViaje(false)
                .build();

        // p2: Solo hotel + seguro, sin vuelo ni desayuno ni tour
        PaqueteViaje p2 = new PaqueteViaje.Builder("Villa de Leyva", 2)
                .conHotel("Posada del Sol")
                .conSeguroViaje(true)
                .build();

        System.out.println(p1);
        System.out.println(p2);

        // p3: Se le olvidó el destino -> Debe RECHAZARSE al construir
        try {
            PaqueteViaje p3 = new PaqueteViaje.Builder()
                    .conNoches(3)
                    .conTour("Cafe en Salento")
                    .build();
            System.out.println(p3);
        } catch (IllegalArgumentException e) {
            System.out.println("[RECHAZADO p3] " + e.getMessage());
        }

        // p4: 0 noches -> Debe RECHAZARSE al construir
        try {
            PaqueteViaje p4 = new PaqueteViaje.Builder("San Andres", 0).build();
            System.out.println(p4);
        } catch (IllegalArgumentException e) {
            System.out.println("[RECHAZADO p4] " + e.getMessage());
        }

        System.out.println();
        System.out.println("ESPERADO -> p1 y p2 se construyen leyendo claramente que incluyen,");
        System.out.println("            p3 y p4 se RECHAZAN al construirse (sin destino / 0 noches)");
    }
}