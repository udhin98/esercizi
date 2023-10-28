public class es20 {
    public static void main(String[] args) {
        int numero = 2;
        tabellina(numero);
    }
    public static void tabellina (int numero) {
        int x = 0;
        for(int i=1; i<=10; i++) {
            x = numero * i;
            System.out.println(x);

        }

    }
}
