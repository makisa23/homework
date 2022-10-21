import java.util.Scanner;

public class D_02 {
    public static void main(String[] args) {
        Scanner velicina = new Scanner(System.in);
        System.out.print("Unesite zeljenu velicinu ");
        int velicinaOdece = velicina.nextInt();
        switch (velicinaOdece) {
            case 24:
                System.out.println("S velicina");
                break;
            case 30:
                System.out.println("M velicina");
                break;
            case 36:
                System.out.println("L velicina");
                break;
            case 42:
                System.out.println("XL velicina");
                break;
            default:
                System.out.println("Pogresan unos");
        }

    }
}
