public class es21 {
    public static void main(String[] args) {
        int numero = 6;
        int stop = 3;
        decrescente(numero, stop);
    }
    public static void decrescente (int numero, int stop) {
        for (int i=0; i < stop; i++) {
            System.out.println(numero - i);
        }
    }
}
