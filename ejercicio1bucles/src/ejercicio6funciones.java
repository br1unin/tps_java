public class ejercicio6funciones {
    public static void main(String[] args) {
        double[] facturas = {100.0, 200.0, 300.0, 400.0, 500.0};

        double[] impuestos = calcularImpuesto(facturas);

        for(int i = 0; i < impuestos.length; i++) {
            System.out.println("La factura " + (i+1) + " tiene un impuesto de: $" + impuestos[i]);
        }
    }

    public static double[] calcularImpuesto(double[] facturas) {
        double[] impuestos = new double[facturas.length];
        for(int i = 0; i < facturas.length; i++) {
            impuestos[i] = facturas[i] * 0.21;
        }

        return impuestos;
    }
}


