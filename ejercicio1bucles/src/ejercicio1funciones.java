import java.util.Scanner;

public class ejercicio1funciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ventas = new int[31];
        int i;
        for (i=1;i<ventas.length;i++){
            System.out.println("Ingresa el numero de ventas de hoy, día " + i + " del mes");
            ventas[i] = sc.nextInt();
        }
        int ingreso = calcularventas(ventas);
        System.out.println("El total de ventas del mes fue: " +ingreso);
    }
    public static int calcularventas(int[] ventas){
     int total = 0;
     for (int venta : ventas)
       total += venta;
     return total;
    }
}
