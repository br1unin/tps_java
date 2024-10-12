import java.util.Scanner;

public class ejercicio4bucles {
    public static void main(String[] args) {
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        Scanner sc = new Scanner(System.in);
        int ventas, i;
        i = 0;
        ventas = 0;
        while (i < dias.length) {
            System.out.println("Ingrese las ventas del día " + (dias[i]));
            ventas += sc.nextInt();
        i++;
        }

        System.out.println("Las ventas totales de la semana fueron: " +ventas);
    }
}