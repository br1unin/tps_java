import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        int peso, tiempo;
        String tipo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu peso");
        peso = sc.nextInt();
        System.out.println("Ingresa la duracion del ejercicio en minutos");
        tiempo = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa el tipo de ejercicio en minusculas (correr, nadar o andar en bicicleta");
        tipo = sc.nextLine();
        switch (tipo){
    case "nadar":
        System.out.println("Quemaste" + (peso*tiempo) + " calorias");
        break;
    case "correr":
        int distancia;
        System.out.println("Ingresa la distancia que recorriste en kilometros");
        distancia = sc.nextInt();
        System.out.println("Quemaste:" + (peso*tiempo*distancia) + " calorias");
        break;
    case "andar en bicicleta":
        int distancia2;
        System.out.println("Ingresa la distancia que recorriste en kilometros");
        distancia2 = sc.nextInt();
        System.out.println("Quemaste:" + (peso*(tiempo*60)*distancia2*4) + " calorias");
        break;}
}
    }

