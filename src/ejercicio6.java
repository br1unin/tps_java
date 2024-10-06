import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántas horas puedes estudiar al día?");
        int horasPorDia = scanner.nextInt();
        int totalMaterias = 5;
        int horasPorSemana = horasPorDia * 7;
        int horasPorMateria = horasPorSemana / totalMaterias;

        System.out.println("Plan de estudio semanal:");
        System.out.println("Matemáticas: " + horasPorMateria + " horas a la semana.");
        System.out.println("Ciencias: " + horasPorMateria + " horas a la semana.");
        System.out.println("Historia: " + horasPorMateria + " horas a la semana.");
        System.out.println("Lenguaje: " + horasPorMateria + " horas a la semana.");
        System.out.println("Tecnología: " + horasPorMateria + " horas a la semana.");

    }
}