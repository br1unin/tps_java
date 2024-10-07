import java.util.Scanner;

public class ejercicio4_2 {
    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su altura en centimetros");
        altura = sc.nextDouble() / 100;
        System.out.println("Ingrese su peso en kilogramos");
        peso = sc.nextDouble();
        imc = peso / (altura * 2);
        sc.nextLine();
        System.out.println("Tu indice de masa corporal es de " + imc);
        if (imc < 18)
            System.out.println("Tienes un indice de masa corporal muy bajo deberias visitar un nutricionista lo antes posible");
        else if (imc > 18 || imc > 24)
            System.out.println("Tu imc es normal, estas perfecto!");
        else if (imc < 25 || imc > 30)
            System.out.println("Tienes sobrepeso, deberias visitar un nutricionista");
        else if (imc > 30 || imc < 35)
            System.out.println("Tienes obesidad, deberias visitar un nutricionista lo antes posible");
    }
}

