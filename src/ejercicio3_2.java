import java.util.Scanner;

public class ejercicio3_2 {public class ejercicio1_3 {
    public static void main(String[] args) {
        String Nivel;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa su género favorito de pelicula (fantasia, misterio, romance,ciencia ficción)");
        Nivel = sc.nextLine();
        switch (Nivel) {
            case "fantasia":
                System.out.println("Recomendación de libro de fantasia: Harry Potter ");
                break;
            case "misterio":
                System.out.println("Recomendación de libro de misterio: El sueño eterno");
                break;
            case "romance":
                System.out.println("Recomendación de libro de romance: Antes de ti");
                break;
            case "ciencia ficción":
                System.out.println("Recomendación de libro de Ciencia Ficción: Blade Runner 2049");
                break;

        }
    }
}
}
