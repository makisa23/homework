import java.util.Arrays;
import java.util.Scanner;

public class D_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu niza");
        int n = s.nextInt();
        int[] niz1 = new int[n];
        int[] niz2 = new int[niz1.length];

        for (int i = 0; i < niz1.length; i++) {
            System.out.println("Unesite broj: ");
            niz1[i] = s.nextInt();
        }
        System.out.println("Niz je: " + Arrays.toString(niz1));
        for (int i = niz1.length - 1, j = 0; i >= 0; i--, j++) {
            niz2[j] = niz1[i];
        }
        System.out.println("Obrnuti niz: " + Arrays.toString(niz2));

        int[] niz3 = new int[niz2.length];
        int z = 0;
        for (int i = 0; i < niz2.length; i++) {
            if (niz2[i] % 2 != 0) {
                niz3[i] = niz2[i];
            } else {
                z++;
            }
        }
        System.out.println("Niz bez parnog sa null: " + Arrays.toString(niz3));
        int[] niz4 = new int[niz3.length - z];
        for (int i =0, j=0; i <niz3.length; i++){
            if (niz3[i] !=0){
                niz4[j] =niz3[i];
                j++;
            }
        }
        System.out.println("Niz bez parnih brojeva: " +Arrays.toString(niz4));
    }

    }

