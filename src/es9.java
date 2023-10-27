public class es9 {
    public static void main(String args[]) {
        int x=4;
        int y=9;

        System.out.println("Il risultato di x e y incrementatiti e moltipicati è  = " + incrMult(x, y));
    }
    public static int incrMult (int x, int y) {
        x++;
        y++;
        int z = x * y;
        return z;
    }
}
