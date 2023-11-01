import java.util.Arrays;

public class es28 {
    public static void main(String[] args) {

        int[][] matrice = {{1, 2, 3}, {4, 5, 6}};

        stampaMatrice(matrice);

        int[][] scambioMatrice = inverti(matrice);
        stampaMatrice(scambioMatrice);

    }
    public static int[][] inverti (int[][] matrice) {

        int righe = matrice.length;

        int colonne = matrice[0].length;

        int[][] matriceScambiata = new int[colonne][righe];

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                matriceScambiata[j][i] = matrice[i][j];
            }
        }

                  return matriceScambiata;
    }

    public static void stampaMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                System.out.print(matrice[i][j]);
            }
            System.out.println();
        }
    }
}
