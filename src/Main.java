import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String Horoscopo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al programa de horoscopos, ingrese su fecha de nacimiento.");
        Horoscopo = sc.nextLine();
        String[] partes = Horoscopo.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        if (dia >= 21 && mes == 3 || dia < 19 && mes == 4) {
            System.out.println("Hola Aries!");
            System.out.println("Tu mensaje del horoscopo es: Confia en tu corazón");}
            else if (dia >= 20 && mes == 4 || dia <= 20 && mes == 5) {
                System.out.println("Hola Tauro!");
                System.out.println("Tu mensaje del horoscopo es: Piensa bien tus decisiones.");
            }else if (dia >= 21 && mes == 5 || dia <= 20 && mes == 6) {
                System.out.println("Hola Geminis!");
                System.out.println("Tu mensaje del horoscopo es: Cuidado con la oscuridad de las personas.");
            }else if (dia >= 21 && mes == 6 || dia <= 22 && mes == 7) {
                System.out.println("Hola Cancer!");
                System.out.println("Tu mensaje del horoscopo es: Sigue el caballo azul en la inmensidad de tu mente.");
            }else if (dia >= 23 && mes == 6 || dia <= 22 && mes == 7) {
                System.out.println("Hola Leo!");
                System.out.println("Tu mensaje del horoscopo es: Con tu voluntad de acero, supera las montañas mas dificiles.");
            }else if (dia >= 23 && mes == 8 || dia <= 22 && mes == 9) {
                System.out.println("Hola Virgo!");
                System.out.println("Tu mensaje del horoscopo es: Sigue el hilo rojo del destino.");
            }else if (dia >= 23 && mes == 9 || dia <= 22 && mes == 10) {
                System.out.println("Hola Libra!");
                System.out.println("Tu mensaje del horoscopo es: Este año va a ser la respuesta que buscabas.");
            }else if (dia >= 23 && mes == 10 || dia <= 21 && mes == 11) {
                System.out.println("Hola Escorpio!");
                System.out.println("Tu mensaje del horoscopo es: Baila con el ritmo de los dias.");
            }else if (dia >= 22 && mes == 11 || dia <= 21 && mes == 12) {
                System.out.println("Hola Sagitario!");
                System.out.println("Tu mensaje del horoscopo es: Vuela como un ave con tus corazonadas.");
            }else if (dia >= 22 && mes == 12 || dia <= 19 && mes == 1) {
                System.out.println("Hola Capricornio!");
                System.out.println("Tu mensaje del horoscopo es: Este mes va a darte felicidad.");
            }else if (dia >= 20 && mes == 1 || dia <= 18 && mes == 2) {
                System.out.println("Hola Acuario!");
                System.out.println("Tu mensaje del horoscopo es: Tus respuestas se acercan.");
            }else if (dia >= 19 && mes == 2 || dia <= 20 && mes == 3) {
                System.out.println("Hola Piscis!");
                System.out.println("Tu mensaje del horoscopo es: Piensa bien tus decisiones.");
            }else             System.out.println("La fecha ingresada es incorrecta");
        ;
                ;
            }

        }

