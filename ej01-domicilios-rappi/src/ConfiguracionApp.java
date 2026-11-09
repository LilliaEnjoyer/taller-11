public class ConfiguracionApp {
    // 1. Se crea la instancia única tan pronto la JVM carga la clase en memoria
    private static final ConfiguracionApp INSTANCIA = new ConfiguracionApp();

    private double tarifaBase = 3000.0;
    private double valorPorKm = 1300.0;
    private double recargoLluvia = 0.0;

    // 2. Constructor privado para evitar 'new' externos
    private ConfiguracionApp() {
        System.out.println(">> Leyendo config.properties... (carga única)");
    }

    // 3. Simplemente devuelves la instancia ya creada (limpio, sin synchronized ni if)
    public static ConfiguracionApp getInstancia() {
        return INSTANCIA;
    }

    public double getTarifaBase() { 
        return tarifaBase; 
    }
    public double getValorPorKm() { 
        return valorPorKm; 
    }
    public double getRecargoLluvia() { 
        return recargoLluvia; 
    }
    public void setRecargoLluvia(double recargoLluvia) { 
        this.recargoLluvia = recargoLluvia; 
    }
}