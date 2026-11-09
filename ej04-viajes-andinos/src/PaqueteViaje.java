public class PaqueteViaje {
    private final String destino;     // obligatorio
    private final int noches;         // obligatorio, mínimo 1
    private final boolean vuelo;
    private final String hotel;
    private final boolean desayuno;
    private final String tour;
    private final boolean seguroViaje;

    private PaqueteViaje(Builder builder) {
        this.destino = builder.destino;
        this.noches = builder.noches;
        this.vuelo = builder.vuelo;
        this.hotel = builder.hotel;
        this.desayuno = builder.desayuno;
        this.tour = builder.tour;
        this.seguroViaje = builder.seguroViaje;
    }

    public String getDestino() { return destino; }
    public int getNoches() { return noches; }
    public boolean isVuelo() { return vuelo; }
    public String getHotel() { return hotel; }
    public boolean isDesayuno() { return desayuno; }
    public String getTour() { return tour; }
    public boolean isSeguroViaje() { return seguroViaje; }

    public static class Builder {
        // Atributos obligatorios
        private String destino;
        private int noches;

        // Atributos opcionales
        private boolean vuelo = false;
        private String hotel = null;
        private boolean desayuno = false;
        private String tour = null;
        private boolean seguroViaje = false;

        public Builder() {
        }

        public Builder(String destino, int noches) {
            this.destino = destino;
            this.noches = noches;
        }

        public Builder conDestino(String destino) {
            this.destino = destino;
            return this;
        }

        public Builder conNoches(int noches) {
            this.noches = noches;
            return this;
        }

        public Builder conVuelo(boolean vuelo) {
            this.vuelo = vuelo;
            return this;
        }

        public Builder conHotel(String hotel) {
            this.hotel = hotel;
            return this;
        }

        public Builder conDesayuno(boolean desayuno) {
            this.desayuno = desayuno;
            return this;
        }

        public Builder conTour(String tour) {
            this.tour = tour;
            return this;
        }

        public Builder conSeguroViaje(boolean seguroViaje) {
            this.seguroViaje = seguroViaje;
            return this;
        }

        public PaqueteViaje build() {
            if (destino == null || destino.trim().isEmpty()) {
                throw new IllegalArgumentException("El paquete requiere un destino obligatorio.");
            }
            if (noches < 1) {
                throw new IllegalArgumentException("El paquete debe tener al menos 1 noche.");
            }
            return new PaqueteViaje(this);
        }
    }

    @Override
    public String toString() {
        return destino + " (" + noches + " noches)"
                + (vuelo ? " + vuelo" : "")
                + (hotel != null ? " + hotel " + hotel : "")
                + (desayuno ? " + desayuno" : "")
                + (tour != null ? " + tour " + tour : "")
                + (seguroViaje ? " + seguro" : "");
    }
}