import java.util.Scanner;

public class EJERCICIO5 {
    public static void main(String[] args) {
        int precio, consumo, distancia;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la distancia que va a recorrer en kilometros");
        distancia = sc.nextInt();
        System.out.println("Ingresa el consumo de combustible en litros por kilometros");
        consumo = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa el precio del combustible por litros");
        precio = sc.nextInt();
        System.out.println("El costo total del viaje es de" + ((distancia * consumo)+ precio) + " $");
    }
}