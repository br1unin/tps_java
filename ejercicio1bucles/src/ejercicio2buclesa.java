import java.util.Scanner;
public class ejercicio2buclesa {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    for (int i = 0; i <= N; i++) {
        System.out.println(factorial(i));
    }
}

    public static long factorial(int numero) {
        long resultado = 1;
        for (int factor = 2; factor <= numero; factor++) {
            resultado *= factor;
        }
        return resultado;
    }
}
