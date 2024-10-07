import java.util.Scanner;

public class ejercicio1_2 {
    public static void main(String[] args) {
        String Nivel;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa su género favorito de pelicula (acción, comedia, drama,ciencia ficción)");
        Nivel = sc.nextLine();
        switch (Nivel) {
            case "acción":
                System.out.println("Recomendación de pelicula de acción: EXTRACTION 2");
                break;
            case "comedia":
                System.out.println("Recomendación de pelicula de comedia: Mi novia poli");
                break;
            case "drama":
                System.out.println("Recomendación de pelicula de drama: Oppenheimer");
                break;
            case "ciencia ficción":
                System.out.println("Recomendación de pelicula de Ciencia Ficción: Blade Runner 2049");
                break;

        }
    }
}
