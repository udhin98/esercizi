public class es14 {
    public static void main(String args[]) {
        int x=9;

        System.out.println(isPari(x));
    }
    public static boolean isPari (int x) {

        boolean z = (x % 2 == 0) || (x == 0) ;
        return z;
    }
}
