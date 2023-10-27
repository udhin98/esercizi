public class es13 {
    public static void main(String args[]) {
        int x=10;
        int y=20;
        int z = 11;


        System.out.println(confronto(x, y, z));
    }
    public static boolean confronto (int x, int y, int z) {

        boolean compreso = z >= x && z <= y;
        return compreso;
    }
}
