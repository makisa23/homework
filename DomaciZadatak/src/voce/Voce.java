package voce;

public class Voce {
    /*Klasa voce.Voce:
-String ime
-String sezona
-double cenaZaKilogram
-String boja
- metod koji vraca true ukoliko je sezona ovom vocu:
	public boolean jeSezona(String sezona)
- za unetu svotu novca vratiti kolicinu voca koje moze da se kupi
	public int sumaVoca(double pare)
Klasa Jagode :
 - napisati metod koji povecava cenu jagoda za 20% ako im nije sezona
	public void povecajCenuJagoda(String sezona)
Klasa voce.Breskva:
- napisati metod koji ce smanjiti cenu breskva za 15% ako su zelene
	public void smanjiCenuBreskva(String boja)
*Implementirati konstruktor i sve get i set metode za date klase*/
    private String ime;
    private String sezona;
    private double cenaZaKilogram;
    private String boja;

    public Voce(String ime, String sezona, double cenaZaKilogram, String boja) {
        this.ime = ime;
        this.sezona = sezona;
        this.cenaZaKilogram = cenaZaKilogram;
        this.boja = boja;
    }

    public String getIme() {
        return ime;
    }

    public String getSezona() {
        return sezona;
    }

    public double getCenaZaKilogram() {
        return cenaZaKilogram;
    }

    public String getBoja() {
        return boja;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setSezona(String sezona) {
        this.sezona = sezona;
    }

    public void setCenaZaKilogram(double cenaZaKilogram) {
        this.cenaZaKilogram = cenaZaKilogram;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }
    public boolean jeSezona(String sezona){
        boolean sezonskoVoce = false;
        if (sezona.equalsIgnoreCase("leto")){
            sezonskoVoce = true;
        }

        return sezonskoVoce;
    }
    public int sumaVoca(double pare) {
        int  kolicinaVoca = (int) (pare / getCenaZaKilogram());
        System.out.println(kolicinaVoca);
        return kolicinaVoca;
    }

    public static void main(String[] args) {
        Voce voce1 = new Voce("jabuka", "zima", 100, "zelena");

        assert voce1.jeSezona(voce1.getSezona())==false;
        assert voce1.sumaVoca(200.0)==2;
        System.out.println("Test prosao");
    }
}
