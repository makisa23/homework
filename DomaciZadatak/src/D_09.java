import java.util.Arrays;

public class D_09 {
    public static void main(String[] args) {
        int [] niz1 = {1, 2, 3, 4, 5, 6, 7};
        int [] niz2 = new int[niz1.length-1];
        int [] niz3 = new int[niz2.length-1];
        int index1 = 2;
        int index2 = 3;
        for (int i = 0, j=0; i < niz1.length-1; i++, j++) {
            if (i == index1) {
                j= i +1;
            }


            niz2[i] = niz1[j];
        }
        System.out.println("Posle prvog brisanja" + Arrays.toString(niz2));

        for (int i = 0, k = 0; i < niz2.length-1; i++, k++) {
            if (i == index2) {
                k = i + 1;
            }

            niz3[i] = niz2[k];
        }
        System.out.println("Posle drugog brisanja" + Arrays.toString(niz3));
    }
}

