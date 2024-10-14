public class ejercicio3funciones {
    public static void main(String[] args) {
        String[] clientes = {"Oscar Cortez", "Leandro Martinez", "Renzo Biondo", "Tadeo Escudero", "Juan Ignacio Martin"};
        int[]  deudas= {590, 9000, 500000, 100, 50};

        enviarFacturas(clientes, deudas);
    }
    public static void enviarFacturas(String[] clientes, int[] deudas) {
        for (int i = 0; i < clientes.length; i++) {
            if (deudas[i] > 500) {
                System.out.println(clientes[i] + " Debe +500, Deuda: " + deudas[i]);
            }
        }
    }
}


