
import java.util.Scanner;

public class D_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite prvi string: ");
        String prviString = s.nextLine();
        System.out.print("Unesite drugi string: ");
        String drugiString = s.nextLine();
         poredjenjeStringova(prviString, drugiString);


    }
    public static int poredjenjeStringova (String prviString, String drugiString){
        int poredjenjeStringova = 0;
        if (prviString.length()>drugiString.length()){
            poredjenjeStringova=prviString.length()-drugiString.length();
            System.out.print("Duzina prvog string-a je veca od duzine drugog string-a za: ");
            System.out.println(poredjenjeStringova);
        } else if (prviString.length()==drugiString.length()){
            System.out.println("Duzina oba string-a je jednaka");
            String [] slova1 = prviString.split("");
            String [] slova2 = drugiString.split("");
            System.out.print("Samoglasnici su: ");
            for (int i = 0; i <prviString.length(); i++ ){
                if       ((slova1[i].equals("a") || slova1[i].equals("e")  || slova1[i].equals("i")
                        || slova1[i].equals("o") || slova1[i].equals("u")) || (slova2[i].equals("a")
                        ||  slova2[i].equals("e") || slova2[i].equals("i")
                        || slova2[i].equals("o") || slova2[i].equals("u")) ) {
                    System.out.print(slova1[i] + " " + slova2[i] + " ");
                }
            }

        } else {
            poredjenjeStringova=drugiString.length()-prviString.length();
            System.out.print("Duzina drugog string-a je veca od duzine prvog stringa-a za: ");
            System.out.println(poredjenjeStringova);
        }

        return poredjenjeStringova;
    }
}
