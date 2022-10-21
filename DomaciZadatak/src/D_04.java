import java.util.Scanner;

public class D_04 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Unesite rec: ");
        String rec = x.nextLine();
        System.out.println("Uneli ste rec " + rec);
        char samoglasnik1 = 'o';
        char samoglasnik2 = 'a';
        char samoglasnik3 = 'e';
        char samoglasnik4 = 'i';
        char samoglasnik5 = 'u';
        int index = 0;
        while (index < rec.length()) {

            char karakterUReci = rec.charAt(index);
            if (karakterUReci == samoglasnik1) {
                System.out.println(samoglasnik1);
            }
                if (karakterUReci == samoglasnik2) {
                    System.out.println(samoglasnik2);
                }
                if (karakterUReci == samoglasnik3) {
                    System.out.println(samoglasnik3);
                }
                if (karakterUReci == samoglasnik4) {
                    System.out.println(samoglasnik4);
                }
                if (karakterUReci == samoglasnik5) {
                    System.out.println(samoglasnik5);
                }


            index++;
        }
    }
}


