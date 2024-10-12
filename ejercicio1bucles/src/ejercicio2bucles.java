import java.util.Scanner;
import java.util.SortedMap;

public class ejercicio2bucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empleados,cobro;
        System.out.println("Ingrese la cantidad de empleados que desea calcular.");
        empleados = sc.nextInt();
        for(int i=0; i <=empleados;i++){
            System.out.println("Ingrese la cantidad de horas trabajadas");
            int horas = sc.nextInt();
            cobro = (horas * 15);
            System.out.println("El salario a pagar es de: " + cobro);
        };
        System.out.println("Programa finalizado, apagando...");
    }
}
