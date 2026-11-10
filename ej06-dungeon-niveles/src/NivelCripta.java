public class NivelCripta extends Nivel {
    @Override
    public Enemigo crearEnemigo() {
        return new Esqueleto();
    }
}
