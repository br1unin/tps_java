public class ejercicio7funciones {public static void main(String[] args) {
    double[] compras = {100.0, 600.0, 300.0, 750.0, 400.0};
    double[] comprasConDescuento = aplicarDescuento(compras);
    for (int i = 0; i < comprasConDescuento.length; i++) {
        System.out.println("La compra " + (i+1) + " después del descuento es: $" + comprasConDescuento[i]);
    }
}

    public static double[] aplicarDescuento(double[] compras) {
        double[] resultado = new double[compras.length];
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                resultado[i] = compras[i] * 0.85;
            } else {
                resultado[i] = compras[i];
            }
        }
        return resultado;
    }
}
