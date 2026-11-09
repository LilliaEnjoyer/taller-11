public class Main {
    public static void main(String[] args) {
        Hamburguesa h1 = new Hamburguesa.Builder("res", 2).conQueso(true).conSalsa("bbq").build();

        Hamburguesa h2 = new Hamburguesa.Builder("pollo", 1).conPepinillos(true).build();

        System.out.println(h1);
        System.out.println(h2);

        try {
            Hamburguesa h3 = new Hamburguesa.Builder("res", 7).conSalsa("miel mostaza").build();
            System.out.println(h3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error esperado: " + e.getMessage());
        }
    }
}