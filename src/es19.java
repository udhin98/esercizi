//Scrivere un programma che contenga un metodo che sfrutti il while loop e prenda in ingresso 1 valore intero
//come limite superiore e calcoli la somma di tutti i valori prima del limite e la stampi a video.
public class es19 {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(sumvalue(numero));
    }
    public static int sumvalue (int numero) {
        int y=0;
        int conto = 0;
        while (y<numero) {
            conto = conto + y;
            y++;
        }
        return conto;
    }
}
