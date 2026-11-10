public class Boleta {

    private final String pelicula;
    private final String silla;
    private final boolean es3D;
    private final boolean sillaVip;
    private final String combo;
    private final boolean estudiante;

    private Boleta(Builder builder) {
        this.pelicula = builder.pelicula;
        this.silla = builder.silla;
        this.es3D = builder.es3D;
        this.sillaVip = builder.sillaVip;
        this.combo = builder.combo;
        this.estudiante = builder.estudiante;
    }

    public String getSilla() {
        return silla;
    }

    // Métodos de fábrica rápidos para llamadas limpias en el Main
    public static Boleta crearVipCompleta(String pelicula, String silla, String combo) {
        return new Builder(pelicula, silla).es3D(true).sillaVip(true).combo(combo).build();
    }

    public static Boleta crearEstudiante(String pelicula, String silla) {
        return new Builder(pelicula, silla).estudiante(true).build();
    }

    public static Boleta crearNormal(String pelicula, String silla, String combo) {
        return new Builder(pelicula, silla).combo(combo).build();
    }

    @Override
    public String toString() {
        return pelicula + " | silla " + silla
             + (es3D ? " | 3D" : "")
             + (sillaVip ? " | VIP" : "")
             + (combo != null ? " | combo " + combo : "")
             + (estudiante ? " | tarifa estudiante" : "");
    }

    public static class Builder {
        private final String pelicula;
        private final String silla;
        private boolean es3D = false;
        private boolean sillaVip = false;
        private String combo = null;
        private boolean estudiante = false;

        public Builder(String pelicula, String silla) {
            if (pelicula == null || pelicula.trim().isEmpty()) {
                throw new IllegalArgumentException("La película es obligatoria.");
            }
            if (silla == null || silla.trim().isEmpty()) {
                throw new IllegalArgumentException("La silla es obligatoria.");
            }
            this.pelicula = pelicula;
            this.silla = silla;
        }

        public Builder es3D(boolean es3D) {
            this.es3D = es3D;
            return this;
        }

        public Builder sillaVip(boolean sillaVip) {
            this.sillaVip = sillaVip;
            return this;
        }

        public Builder combo(String combo) {
            this.combo = combo;
            return this;
        }

        public Builder estudiante(boolean estudiante) {
            this.estudiante = estudiante;
            return this;
        }

        public Boleta build() {
            return new Boleta(this);
        }
    }
}