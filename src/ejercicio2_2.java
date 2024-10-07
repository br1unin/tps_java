import java.util.Scanner;

public class ejercicio2_2 {
    public static void main(String[] args) {
        int satisfaccion;
        String estres;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        satisfaccion = sc.nextInt();
        System.out.println("Ingrese su categoria de cliente (estudiante, adulto, jubilado)");
        sc.nextLine();
        estres = sc.nextLine();
        switch (estres) {
            case "estudiante":
                System.out.println("El precio final del  producto es de" + (satisfaccion - satisfaccion * 0.10));
                break;
            case "adulto":
                System.out.println("El precio final del  producto es de" + (satisfaccion - satisfaccion * 0.05));
                break;
            case "jubilado":
                System.out.println("El precio final del  producto es de" + (satisfaccion - satisfaccion * 0.15));
                break;
        }
    }
}

