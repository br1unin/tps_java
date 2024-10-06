import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        int satisfaccion, estres, salud, tristeza;
        Scanner sc = new Scanner(System.in);
        System.out.println("Califique su nivel de satisfaccion de vida de un 1 al 10");
        satisfaccion = sc.nextInt();
        System.out.println("Califique su nivel de estres de un  1 al 10");
        estres = sc.nextInt();
        sc.nextLine();
        System.out.println("Califique su nivel de salud de un 1 al 10");
        salud = sc.nextInt();
        System.out.println("Califique su nivel de tristeza de un 1 al 10");
        tristeza = sc.nextInt();
        System.out.println("Su nivel de felicidad es de " + (satisfaccion + salud / (estres + tristeza)));
    }
}