public class es22 {
    public static void main(String[] args) {
        int numero = 10;
        stop(numero);
    }
    public static void stop (int numero) {
        for (int i=0; i<=numero; i++) {

            if (i==5) {
                break;
            }
            System.out.println(i);
        }
    }
}

