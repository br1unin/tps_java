public class ejercicio9funciones {  public static void main(String[] args) {
    double[] preciosOriginales = {100.0, 200.0, 300.0, 400.0, 500.0};
    double[] preciosFinales = calcularPrecioFinal(preciosOriginales);

    for (int i = 0; i < preciosFinales.length; i++) {
        System.out.println("El precio final del producto " + (i + 1) + " es: $" + preciosFinales[i]);
    }
}

    public static double[] calcularPrecioFinal(double[] preciosOriginales) {
        double[] preciosFinales = new double[preciosOriginales.length];

        for (int i = 0; i < preciosOriginales.length; i++) {
            preciosFinales[i] = preciosOriginales[i] * 0.9;
        }

        return preciosFinales;
    }
}
