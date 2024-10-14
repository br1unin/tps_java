public class ejercicio4buclesa {  public static void main(String[] args) {
    for (int i = 0; i < 26; i++) {
        for (char c = 'Z'; c >= 'A' + i; c--) {
            System.out.print(c);
        }
        System.out.println();
    }
}
}
