import java.util.Arrays;

public class D_09DrugiNacin {
    public static void main(String[] args) {

        int[] niz1 = {1, 2, 3, 4, 5, 6, 7};
        int[] kraciNiz = new int[niz1.length-2];
        int index1 = 3;
        int index2 = 5;
        int j = 0;
        System.out.println(Arrays.toString(niz1));
        for (int i = 0; i < niz1.length; i++){
            if (i!=index1 && i!=index2){
                kraciNiz[j] = niz1[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(kraciNiz));

    }

}
