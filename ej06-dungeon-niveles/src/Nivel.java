public abstract class Nivel{
    public abstract Enemigo crearEnemigo();

    public void iniciar(int cantidadEnemigos) {
        for (int i = 0; i < cantidadEnemigos; i++) {
            Enemigo enemigo = crearEnemigo();
            enemigo.atacar();
        }
    }
}