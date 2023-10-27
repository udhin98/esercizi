public class es8 {
    public static void main (String args[]) {
        float number1 = 4;
        float number2 = 10;
        float number3 = 3;
        System.out.println("la media tra i 3 numeri è: " + media(number1, number2, number3));

    }
    public static float media (float number1, float number2, float number3) {
        float x = (number1 + number2 + number3) / 3;
        return x;
    }
}

