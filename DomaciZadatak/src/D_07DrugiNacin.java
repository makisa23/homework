
import java.util.Scanner;

public class D_07DrugiNacin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite velicinu niza: ");
        int n = s.nextInt();
        String[] imena = new String[n];
        int i;
        for (i = 0; i < imena.length; i++) {
            System.out.print("Unesite ime: ");
            imena[i] = s.next().toUpperCase();
        }
        for ( i = 0; i < imena.length; i++) {
            if (imena[i].charAt(0) == 'M') {
                System.out.print(imena[i] + " ");

            }


            }
        }
    }

