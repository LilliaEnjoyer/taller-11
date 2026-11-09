public class Hamburguesa {
    private final String proteina;
    private final int porciones;
    private final String pan;
    private final boolean queso;
    private final boolean tocineta;
    private final boolean pepinillos;
    private final boolean cebolla;
    private final String salsa;
    private final boolean extraQueso;

    private Hamburguesa(Builder builder) {
        this.proteina = builder.proteina;
        this.porciones = builder.porciones;
        this.pan = builder.pan;
        this.queso = builder.queso;
        this.tocineta = builder.tocineta;
        this.pepinillos = builder.pepinillos;
        this.cebolla = builder.cebolla;
        this.salsa = builder.salsa;
        this.extraQueso = builder.extraQueso;
    }

    public String getProteina() { return proteina; }
    public int getPorciones() { return porciones; }
    public String getPan() { return pan; }
    public boolean tieneQueso() { return queso; }
    public boolean tieneTocineta() { return tocineta; }
    public boolean tienePepinillos() { return pepinillos; }
    public boolean tieneCebolla() { return cebolla; }
    public String getSalsa() { return salsa; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hamburguesa de ").append(proteina).append(" x").append(porciones);
        sb.append(" | pan: ").append(pan);
        if (queso) sb.append(" | queso");
        if (tocineta) sb.append(" | tocineta");
        if (pepinillos) sb.append(" | pepinillos");
        if (cebolla) sb.append(" | cebolla");
        sb.append(" | salsa: ").append(salsa);
        return sb.toString();
    }


    public static class Builder {
        // Atributos obligatorios
        private final String proteina;
        private final int porciones;
        private String pan = "brioche";
        private boolean queso = false;
        private boolean tocineta = false;
        private boolean pepinillos = false;
        private boolean cebolla = false;
        private String salsa = "ninguna";
        private boolean extraQueso = false;

        public Builder(String proteina, int porciones) {
            if (porciones > 3) {
                throw new IllegalArgumentException("No se permiten más de 3 porciones de proteína.");
            }
            this.proteina = proteina;
            this.porciones = porciones;
        }

        public Builder conPan(String pan) {
            if (pan != null) {
                this.pan = pan;
            }
            return this;
        }

        public Builder conQueso(boolean queso) {
            this.queso = queso;
            return this;
        }

        public Builder conTocineta(boolean tocineta) {
            this.tocineta = tocineta;
            return this;
        }

        public Builder conPepinillos(boolean pepinillos) {
            this.pepinillos = pepinillos;
            return this;
        }

        public Builder conCebolla(boolean cebolla) {
            this.cebolla = cebolla;
            return this;
        }

        public Builder conSalsa(String salsa) {
            if (salsa != null) {
                this.salsa = salsa;
            }
            return this;
        }

        public Builder conExtraQueso(boolean extraQueso) {
            this.extraQueso = extraQueso;
            return this;
        }

        public Hamburguesa build() {
            return new Hamburguesa(this);
        }
    }
}