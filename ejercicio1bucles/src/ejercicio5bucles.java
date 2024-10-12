import java.util.Scanner;

public class ejercicio5bucles {
    public static void main(String[] args) {
        int empleados, i;
        double horas;
        i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de empleados");
        empleados = sc.nextInt();
        while (i < empleados) {
            System.out.println("Ingrese el numero de horas trabajadas por el empleado");
            horas = sc.nextDouble();
            i++;
            if (horas > 40) {
                System.out.println("El empleado trabajo horas extras");
                System.out.println("El total de horas extras que trabajo es de: " + (horas - 40));
            } else if (horas < 40) {
                System.out.println("El empleado trabajo menos de 40 horas");
            } else {
                System.out.println("Se ingreso un caracter no valido");

            }
        }
    }
}