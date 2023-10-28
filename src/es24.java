public class es24 {
    public static void main(String[] args) {
    sum();
    }
    public static void sum ()  {
        int [] numeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int add = 0;
        for (int i = 0; i < numeri.length; i++) {
            add = add + numeri[i];
        }
        System.out.println(add);

    }
}
