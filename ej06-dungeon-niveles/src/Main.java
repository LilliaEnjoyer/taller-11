public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();

        System.out.println("=== Nivel Cripta ===");
        juego.jugarNivel(new NivelCripta(),2);

        System.out.println("=== Nivel Castillo ===");
        juego.jugarNivel(new NivelCastillo(),1);

        System.out.println("=== Nivel Glaciar ===");
        juego.jugarNivel(new NivelGlaciar(),1);

        // NUEVO NIVEL (DLC): Volcan, con enemigos tipo Dragon (-25 HP)
        System.out.println("=== Nivel Volcan ===");
        juego.jugarNivel(new NivelVolcan(),2);


    }
}
