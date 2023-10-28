import java.util.Optional;

//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
//e restituisca il nome del giorno della settimana come stringa o
//una stringa di errore nel caso di valore maggiore di 7 o minore di 1.
public class es17 {
    public static void main(String[] args) {
        int giorno = 3;
        days(giorno);
    }
    public static void days (int giorno) {
        if (giorno>=1 && giorno<=7) {
            switch (giorno) {
                case 1:
                    System.out.println("lunedi");
                    break;
                case 2:
                    System.out.println("martedi");
                    break;
                case 3:
                    System.out.println("mercoledi");
                    break;
                case 4:
                    System.out.println("giovedi");
                    break;
                case 5:
                    System.out.println("venerdi");
                    break;
                case 6:
                    System.out.println("sabato");
                    break;
                case 7:
                    System.out.println("domenica");
                    break;
            }
        } else {
            System.out.println("input errato");
        }
    }
}
