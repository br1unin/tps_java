import java.util.Scanner;

public class ejercicio4 {
        public static void main(String[] args) {
            String Nivel;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa como te sientes(feliz, triste, enérgico, relajado)");
            Nivel = sc.nextLine();
            switch (Nivel) {
                case "feliz":
                    System.out.println("La lista alegre de reproduccion recomendada incluye las siguentes canciones: " +
                            "My Chemical Romance - House Of Wolves\n" +
                            "Soda Stereo - De Música ligera\n" +
                            "Charly Garcia - No Voy En Tren\n" +
                            "Playboi Carti - Sky\n" +
                            "Playboi Carti, The Weeknd - Timeless");
                    break;
                case "triste":
                    System.out.println("La lista melaconlica de reproduccion recomendada incluye las siguentes canciones: " +
                            "My Chemical Romance - Sleep\n" +
                            "My Chemical Romance - Cancer\n" +
                            "Miranda,Emilia - Uno los Dos\n" +
                            "Intoxicados - Nunca Quise\n" +
                            "Vicentico - No te apartes de mi");
                    break;
                case "energetico":
                    System.out.println("La lista energetica de reproduccion recomendada incluye las siguentes canciones: " +
                            "che - CUT OFF YOUR HANDS\n" +
                            "Miranda - Perfecta\n" +
                            "Lil Tecca - BAD TIME\n" +
                            "Blksmiith - SR20DET\n" +
                            "Vierre cloud - moment");
                    break;
                case "relajado":
                    System.out.println("La lista relajada de reproduccion recomendada incluye las siguentes canciones: " +
                            "Sewerslvt - The last thing she sent me\n" +
                            "Radiohead - Creep\n" +
                            "Radiohead - Pablo Honey\n" +
                            "Radiohead - Black star\n" +
                            "Tally Hall - Cannibal");
                    break;



            }
        }
    }
