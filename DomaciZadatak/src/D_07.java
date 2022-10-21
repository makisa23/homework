

import java.util.Arrays;
import java.util.Scanner;

public class D_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite velicinu niza: ");
        int n = s.nextInt();
        String[] imena = new String[n];
        String[] imenaSaM = new String[n];
        int i;
        int j = 0;
        for (i = 0; i < imena.length; i++) {
            System.out.print("Unesite ime: ");
            imena[i] = s.next().toLowerCase();
            if (imena[i].charAt(0) == 'm') {
                imenaSaM[j] = imena[i];
                j++;
            }

            }
            String[] imena1 = new String[j];

            for (i = 0; i < j; i++) {
                imena1[i] = imenaSaM[i];
            }

                System.out.println(Arrays.toString(imena1));
    }
}
