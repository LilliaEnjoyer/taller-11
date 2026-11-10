public class NivelCastillo extends Nivel {
    @Override
    public Enemigo crearEnemigo() {
        return new Fantasma();
    }
}
