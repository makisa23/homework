package voce;

public class Jagoda extends Voce {

    public Jagoda(String ime, String sezona, double cenaZaKilogram, String boja) {
        super(ime, sezona, cenaZaKilogram, boja);
    }
    public void povecajCenuJagoda(String sezona){
        if (!jeSezona(getSezona())){
            setCenaZaKilogram(getCenaZaKilogram()+(getCenaZaKilogram()*20/100));
            System.out.println(getCenaZaKilogram());
        } else {
            System.out.println(getCenaZaKilogram());
        }
    }
    public static void main(String[] args) {
        Jagoda jagoda1 = new Jagoda("sumska jagoda", "leto", 150.0, "crvena");
        Jagoda jagoda2 = new Jagoda("pitoma jagoda", "zima", 100.0, "crvena");
       assert jagoda1.jeSezona(jagoda1.getSezona())== true;
        jagoda1.povecajCenuJagoda(jagoda1.getSezona());
        assert jagoda2.jeSezona(jagoda2.getSezona())==false;
        jagoda2.povecajCenuJagoda(jagoda2.getSezona());
        assert jagoda2.getCenaZaKilogram()==120.0;
        System.out.println("Test prosao");

    }

}
