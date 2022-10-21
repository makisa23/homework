import java.util.Arrays;

public class D_09TreciNacin {
    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3, 4, 5, 6, 7};
        int[] niz2 = new int[niz1.length-2 ];
        int index1 = 3;
        int index2 = 4;
        int j=0;
        for (int i = 0; i < niz1.length ; i++) {
            if (i == index1 || i == index2) {
                continue;
            } else {
                niz2[j] = niz1[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(niz2));
    }

}