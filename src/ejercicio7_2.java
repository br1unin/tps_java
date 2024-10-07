import java.util.Scanner;

public class ejercicio7_2 {
        public static void main(String[] args) {
            String Nivel;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa como te sientes(feliz, triste, enérgico, relajado)");
            Nivel = sc.nextLine();
            switch (Nivel) {
                case "feliz":
                    System.out.println("Una recomendacion segun tu estado de animo es salir a correr o bailar!");
                    break;
                case "triste":
                    System.out.println("Una recomendacion segun tu estado de animo es escuchar musica alegre o hablar con alguien sobre tus  problemas");
                    break;
                case "energetico":
                    System.out.println("Una recomendacion segun tu estado de animo es hacer ejercicio");
                    break;
                case "relajado":
                    System.out.println("Una recomendacion segun tu estado de animo es recostarte o dormir");
                    break;



            }

            }
        }
