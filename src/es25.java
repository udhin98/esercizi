public class es25 {
    public static void main(String[] args) {
        isA();
    }
    public static void isA() {
        char[] caratteri = {'c', 'd', 'a', 'z', 'a', 'a'};
        for (int i = 0; i < caratteri.length; i++) {
            if (caratteri[i] == 'a') {
                System.out.println(caratteri[i]);
            } else {
                System.out.println('0');
            }
        }

    }
}
