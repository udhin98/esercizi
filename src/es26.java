import java.util.Arrays;

public class es26 {
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 1, 1, 4, 5, 1, 5, 4, 3, 2, 1, 6};
        noDup(array);
        System.out.println(Arrays.toString(noDup(array)));
    }

        public static int[] noDup(int[] array) {
        int lunghezzaUnici = 0;

        int[] arrayUnici = new int[array.length];

        for (int j : array) {
            boolean duplicato = false;
            for (int i = 0; i < lunghezzaUnici; i++) {
                if (arrayUnici[i] == j) {
                    duplicato = true;
                    break;
                }
            }

            if (duplicato==false) {
                arrayUnici[lunghezzaUnici] = j;
                lunghezzaUnici++;
            }
        }

        int[] arraySenzaDuplicati = Arrays.copyOf(arrayUnici, lunghezzaUnici);

        return arraySenzaDuplicati;
    }
}
