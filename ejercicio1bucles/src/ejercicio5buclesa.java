public class ejercicio5buclesa {  public static void main(String[] args) {
    for (int i = 0; i < 100000; i++) {
        System.out.println(String.format("%05d", i).replace('3', 'E'));
    }
}
}
