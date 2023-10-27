public class es10 {
    public static void main(String args[]) {
        int x=10;
        int y=25;

        System.out.println("Il risultato di x(incremntato di 5) * y(incrementato di 5) è = " + incr5Mult (x, y));
    }
    public static int incr5Mult (int x, int y) {
        x += 5;
        y += 5;
        int z = x * y;
        return z;
    }
}
