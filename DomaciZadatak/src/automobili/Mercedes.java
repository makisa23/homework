package automobili;

import java.time.LocalDate;

public class Mercedes extends Automobil {

    public Mercedes(String marka, String boja, int brSasije, int godiste, int cena) {
        super(marka, boja, brSasije, godiste, cena);
    }
    @Override
    public void oldTimer(){
        if((LocalDate.now().getYear() - getGodiste()) > 20){
            this.setCena(getCena() - (getCena()*20/100));
            System.out.println("Automobil je stariji od 20 godina, cena je 20% niza " + getCena());
        }
        else {
            System.out.println("Cena je: " + getCena());
        }

    }

    public static void main(String[] args) {
        Mercedes automobil3 = new Mercedes("Mercedes A class","siva", 164789, 2000,15000);
        automobil3.oldTimer();
    }
}
