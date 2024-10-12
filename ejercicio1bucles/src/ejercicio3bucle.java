import java.util.Scanner;
public class ejercicio3bucle {
    public static void main(String[] args) {
        int productoscantidad, i;
        i = 0;
        Scanner sc = new Scanner(System.in);
        String[] productos = {"Elementos de cocina", "Carnes", "Leña", "Golosinas"};
        do {
            System.out.println("Ingrese la cantidad de: " + productos[i]);
            productoscantidad = sc.nextInt();
            i++;
            if (productoscantidad < 5) {
                System.out.println("Hace falta reabastecer este producto");
            } else {
                System.out.println("El producto escrito no necesita ser reabastecido");
            }

        }while (i < productos.length);
        System.out.println("Programa finalizado, Cerrando Sesión...");
        }
    }
