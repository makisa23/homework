package voce;

public class Breskva extends Voce {

    public Breskva(String ime, String sezona, double cenaZaKilogram, String boja) {
        super(ime, sezona, cenaZaKilogram, boja);
    }

    public void smanjiCenuBreskva(String boja) {
        if (getBoja().equalsIgnoreCase("zelena")) {
            setCenaZaKilogram(getCenaZaKilogram() - (getCenaZaKilogram() * 15 / 100));
            System.out.println(getCenaZaKilogram());
        } else {
            System.out.println(getCenaZaKilogram());
        }
    }

    public static void main(String[] args) {
        Breskva breskva1 = new Breskva("breskva", "leto", 200.0, "zelena");
        assert breskva1.jeSezona(breskva1.getSezona()) == true;
        breskva1.smanjiCenuBreskva(breskva1.getBoja());
        assert breskva1.getCenaZaKilogram()==170.0;
        assert breskva1.sumaVoca(340.0)==2;
        System.out.println("Test prosao");
    }
}