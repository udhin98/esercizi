public class es12 {
    public static void main(String args[]) {
        char x = 'a';
        char y = 'b';

        System.out.println(x);
        System.out.println(y);
        System.out.println(isDiff(x, y));
    }
    public static boolean isDiff (char x, char y) {
        boolean z = x != y;
        return z;
    }
}
