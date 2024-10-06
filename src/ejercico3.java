import java.util.Scanner;

public class ejercico3 {
    public static void main(String[] args) {
        String Nivel;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nivel de condicion fisica (Principiante, Intermedio, Avanzado)");
        Nivel = sc.nextLine();
        switch (Nivel) {
            case "Principiante":
                System.out.println("Hola principiante! Tu rutina de esta semana consta de: " +
                        "Caminata rápida o Marcha en el lugar\n" +
                        "Sentadillas\n" +
                        "Planchas\n" +
                        "Elevaciones de piernas\n" +
                        "Bicicleta estática");
                break;
            case "Intermedio":
                System.out.println("Hola gimanasta de nivel promedio! Tu rutina de esta semana consta de: " +
                        "Burpees\n" +
                        "Lunges (Estocadas)\n" +
                        "Push-ups (Flexiones de brazos)\n" +
                        "Russian Twists\n" +
                        "Mountain Climbers");
                break;
            case "Avanzado":
                System.out.println("Hola gimanasta de nivel Avanzado! Tu rutina de esta semana consta de:" +
                        "Pull-ups (Dominadas)\n" +
                        "Muscle-ups\n" +
                        "Pistol Squats (Sentadillas a una pierna)\n" +
                        "Handstand Push-ups (Flexiones en parada de manos)\n" +
                        "Clean and Jerk");
                break;


        }
    }
}