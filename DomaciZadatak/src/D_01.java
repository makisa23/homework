import java.util.Scanner;

public class D_01 {
    public static void main(String[] args) {
        Scanner godina = new Scanner(System.in);
        System.out.print("Unesite godinu pocetka rada ");
        int godinaPocetkaRada = godina.nextInt();

        if (2022 - godinaPocetkaRada <=4) {
            System.out.println("Ti si Junior programer");
        } else if ( 2022 - godinaPocetkaRada >=4 & 2022 - godinaPocetkaRada <=8 ){
            System.out.println("Ti si Senior programer");
        } else {
            System.out.println("Vi ste direktor firme");
        }
    }
}
