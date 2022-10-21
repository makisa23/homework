public class D_10 {
    public static void main(String[] args) {
     faktorijelBroja(5);
    }
    public static int faktorijelBroja (int broj){
        int i = 0;
        int j  = broj;
        int faktorijelBroja = 1;
        if (j>0) {
            while (i < j) {
                faktorijelBroja = faktorijelBroja * broj;
                broj--;
                i++;
            }
        }
        if (j==0){
            faktorijelBroja=1;
        }
        if (j<0) {
            while (i < -j) {
                faktorijelBroja = faktorijelBroja * broj;
                broj++;
                i++;

            }
        }
        System.out.println("Faktorijel broja " + j + " je: " + faktorijelBroja);
        return faktorijelBroja;
    }
}
