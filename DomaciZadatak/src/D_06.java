import java.util.Scanner;

public class D_06 {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int zbir = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Unesite broj, ako unesete 0 kraj programa: ");
            int broj = o.nextInt();
            int x = (int) Math.pow(broj,2);

            if (broj ==0) {
                break;
            }
            if(broj == 4) {
                continue;
            }
            zbir+= x;

        }
        System.out.println("Zbir kvadratnih vrednosti je: " + zbir);
    }
}
