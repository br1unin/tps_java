import java.util.Scanner;

public class ejericicio5funciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] satisfacciones = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese su nivel de satisfacción");
            satisfacciones[i] = sc.nextInt();
        }
        promediosatisff(satisfacciones);
        System.out.println();
    }


    public static void promediosatisff(int[] satisfacciones) {
        int total = 0;
        for (int i = 0; i < satisfacciones.length; i++) {
            total += satisfacciones[i];
        }
        double promedio = (double) total /satisfacciones.length ;
        System.out.println("El promedio de satisfaccion es de: " +promedio);
    }

}



