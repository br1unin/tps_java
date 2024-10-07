import java.util.Random;
import java.util.Scanner;
public class ejercicio5_2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String[] opciones = {"Piedra", "Papel", "Tijera"};
    System.out.println("Elige: Piedra, Papel o Tijera.");
    String eleccionUsuario = scanner.nextLine();
    int indiceRandom = random.nextInt(opciones.length);
    String eleccionComputadora = opciones[indiceRandom];
    System.out.println("Computadora eligió: " + eleccionComputadora);
    if(eleccionUsuario.equalsIgnoreCase(eleccionComputadora)) {
        System.out.println("Empate!");
    } else if( (eleccionUsuario.equalsIgnoreCase("Piedra") && eleccionComputadora.equalsIgnoreCase("Tijera")) ||
            (eleccionUsuario.equalsIgnoreCase("Papel") && eleccionComputadora.equalsIgnoreCase("Piedra")) ||
            (eleccionUsuario.equalsIgnoreCase("Tijera") && eleccionComputadora.equalsIgnoreCase("Papel")) ) {
        System.out.println("Ganaste!");
    } else {
        System.out.println("La computadora gana!");
    }

    scanner.close();
}
}

