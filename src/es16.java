//Scrivi un programma che calcoli la lunghezza di una stringa, sulla base di questa lunghezza stampi
//"Lunghezza maggiore di 10", "Lunghezza minore di 10" o "Lunghezza pari a 10".
public class es16 {
    public static void main(String[] args) {
        String x = "ciao";
        lunghezza(x);
    }
    public static void lunghezza (String x) {
        int y = x.length();
        if (y>10) {
            System.out.println("Lunghezza maggiore di 10");
        } else if (y<10) {
            System.out.println("Lunghezza minore di 10");
        } else if (y==10) {
            System.out.println("Lunghezza pari a 10");
        }
    }
}
