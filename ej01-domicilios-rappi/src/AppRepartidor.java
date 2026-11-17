public class AppRepartidor {

    public void mostrarGanancia(double km) {
        ConfiguracionApp config = ConfiguracionApp.getInstancia();
        double ganancia = config.getTarifaBase() * 0.8 + config.getRecargoLluvia();
        System.out.println("[Repartidor] Ganancia por " + km + " km: $" + ganancia);
    }
}
