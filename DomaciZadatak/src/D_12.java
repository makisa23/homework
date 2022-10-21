import java.util.Arrays;
import java.util.Scanner;

public class D_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite zeljenu duzinu niza: ");
        int n = s.nextInt();
        String[] imena = new String[n];
        unosImena(imena);
        String [] imenaPrvogNiza = new String[n];
        String [] imenaDrugogNiza = new String[n];
        String [] unija = new String[n];
        unijaElemenata(unija,imenaPrvogNiza,imenaDrugogNiza);



    }
    public  static String [] unosImena (String [] imena){
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite imena: ");
        for (int i = 0; i < imena.length; i++){
            imena[i] = s.next();
        }
        System.out.println(Arrays.toString(imena));

        return imena;
    }
    public static String [] unijaElemenata ( String [] unija, String [] imenaPrvogNiza,String [] imenaDrugogNiza ){
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu prvog niza: ");
        int n1 = s.nextInt();
        imenaPrvogNiza = new String[n1];
        unosImena(imenaPrvogNiza);
        System.out.println("Unesite duzinu drugog niza: ");
        int n2 = s.nextInt();
        imenaDrugogNiza = new String[n2];
        unosImena(imenaDrugogNiza);
        int brojacIstih = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (imenaPrvogNiza[i].equalsIgnoreCase(imenaDrugogNiza[j])){
                    brojacIstih++;
                }
            }
        }
        int n3= n1+n2;
        unija = new String[n3-brojacIstih];
        int k = 0;
        for (int i = 0; i < n1; i++){
            boolean imena = false;
            for (int j = 0; j < n2; j++) {
                if (imenaPrvogNiza[i].equalsIgnoreCase(imenaDrugogNiza[j])) {
                    imena = true;
                }
            }
            if (imena) {
                continue;
            }
            unija[k]=imenaPrvogNiza[i];
            k++;
        }

        for (int i = k, j = 0; i < unija.length; i++, j++) {
            unija[i] = imenaDrugogNiza[j];
        }
            System.out.println(Arrays.toString(unija));
             return unija;
        }
    }





