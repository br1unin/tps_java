public class ejercicio8funciones { public static void main(String[] args) {
    String[] empleados = {"Leandro Martinez", "Renzo Biondo", "Juani Martin", "Tadeo Escudero"};
    int[] horasTrabajadas = {40, 35, 45, 30};

    double[] pagosSemanales = calcularPagoSemanal(horasTrabajadas);
    for (int i = 0; i < empleados.length; i++) {
        System.out.println(empleados[i] + " ha trabajado " + horasTrabajadas[i] +
                " horas y recibirá un pago de $" + pagosSemanales[i]);
    }
}

    public static double[] calcularPagoSemanal(int[] horasTrabajadas) {
        double[] pagosSemanales = new double[horasTrabajadas.length];
        for (int i = 0; i < horasTrabajadas.length; i++) {
            pagosSemanales[i] = horasTrabajadas[i] * 15.0;
        }
        return pagosSemanales;
    }
}
