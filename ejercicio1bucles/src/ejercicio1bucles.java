import java.util.Scanner;

public class ejercicio1bucles {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String[] actividades = {"estudiar","hacer ejercicio","leer","tiempo libre"};
       double horas, horast;
       horast=0;
       for (String actividad : actividades) {
           System.out.println("ingresa las horas dedicadas a " +actividad +":");
       horas = sc.nextDouble();
       horast +=  horas ;
       }
        System.out.println("El tiempo total que le dedicas a tus actividades es de " +horast);

        }
    }
