public class ejercicio4funciones {
    public static void main(String[] args) {
        String[] clientes = {"Oscar Cortez", "Leandro Martinez", "Renzo Biondo", "Tadeo Escudero", "Juan Ignacio Martin"};
        int[] compras = {5, 12, 30, 2, 10};

        calcularDescuentos(clientes, compras);
    }
    public static void calcularDescuentos(String[] clientes, int[] compras) {
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 6) {
                System.out.println(clientes[i] + " Tiene un descuento del 50%" );
            }
        }
    }
}
