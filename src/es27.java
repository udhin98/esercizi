import java.util.Arrays;

public class es27 {
    public static void main(String[] args) {
    int[][] array = creaMatrice();
    System.out.println(sumMatrix(array));
    }
    public static int[][] creaMatrice () {
        int[][] matrix = new int[3][3];
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = i+1;
            }
        }
        return matrix;
    }
    public static int sumMatrix (int[][] array) {
        int sum = 0;
        for (int i=0; i<array[0].length; i++) {
            sum = sum + array[0][i];
        }
        return sum;
    }
}


