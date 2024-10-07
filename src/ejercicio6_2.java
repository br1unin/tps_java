import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class ejercicio6_2 {
public static void main(String[] args) {
    int dormir, tiempo,comidas;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa cuantas horas al dia duermes");
    dormir = sc.nextInt();
    System.out.println("Ingresa cuantas horas al dia haces ejercicio");
    tiempo = sc.nextInt();
    sc.nextLine();
    System.out.println("Ingresa cuantas comidas saludables comes al dia");
    comidas = sc.nextInt();
    if (dormir >=8 && tiempo >= 1 && comidas >=2) {
        System.out.println("Eres una persona muy saludable!");
        ;}
    else if (dormir >=6 && tiempo >= 1 && comidas >= 1) {
        System.out.println("Eres una persona medianamete saludable.");
        ;}
    else if (dormir <=6 && tiempo <=1 && comidas <= 1)
        System.out.println("Eres una persona muy poco saludable, deberias mejorar tus habitos.");
    ;}
     }


