public class es11 {
    public static void main(String args[]) {
        int x=10;
        int y=25;

        System.out.println(x);
        System.out.println(y);
        System.out.println(isDiff(x, y));
    }
    public static boolean isDiff (int x, int y) {
        boolean z = x != y;
        return z;
    }
}
