package automobili;

import java.time.LocalDate;

public class BMW extends Automobil {

    public BMW(String marka, String boja, int brSasije, int godiste, int cena) {
        super(marka, boja, brSasije, godiste, cena);
    }
    @Override
    public void oldTimer() {
        if ((LocalDate.now().getYear() - getGodiste()) > 25) {
            this.setCena(getCena() - (getCena() * 30 / 100));
            System.out.println("Automobil je stariji od 25 godina, cena je 30% niza " + getCena());
        } else {
            System.out.println("Cena je: " + getCena());
        }
    }

    public static void main(String[] args) {
        BMW automobil4 = new BMW("bmw", "bela", 132485, 1996, 8000 );
        automobil4.oldTimer();
    }
}
