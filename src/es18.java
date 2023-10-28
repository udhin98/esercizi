//Scrivi un programma che contenga un metodo che prende in ingresso un carattere e ne identifica
//il tipo per un operazione di algebra (+ addizione - sottrazione * moltiplicazione / divisione).
//Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore.
public class es18 {
    public static void main(String[] args) {
        char x = '/';
        System.out.println(algebra(x));
    }
    public static String algebra (char x) {
        String y;
        switch (x) {
            case '+':
                y = "addizione";
                break;
            case '-':
                y = "sottrazione";
                break;
            case '*':
                y = "moltiplicazione";
                break;
            case '/':
                y = "divisione";
                break;
            default:
                y = "error";
        }
            return y;
    }
}
