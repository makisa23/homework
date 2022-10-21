package zaposleni;

public class Zaposleni {
    /*Napraviti klasu Zaposleni:
-String ime
-String pozicija
-int godiste
-int dnevnica
-int sati (gledamo sate kao celebrojne tipove(okrugao sat), bez gledanja minuta)
-int smena (smena moze biti prva druga ili treca, prva je od 7-15, druga je od 15-23 i treca od 23-7)
Konobar i Kuvar nasledjuju klasu Zaposleni
Kreirati klasu Restoran koja ce imati spisak Zaposlenih i metodu za:
Stampanje svih konobara koji radi neku odredjenu smenu (prvu, drugu ili trecu)
public ArrayList<Zaposleni> stampajKonobare(int nekaSmena)
Povecanje dnevnice za 30% svima koji rade trecu smenu
public void povecajCenuTrecojSmeni(ArrayList<Zaposleni> zaposleni)*/
    private String ime;
    private String pozicija;
    private int godiste;
    private int dnevnica;
    private int sati;
    private int smena;

    public Zaposleni(String ime, String pozicija, int godiste, int dnevnica, int sati, int smena) {
        this.ime = ime;
        this.pozicija = pozicija;
        this.godiste = godiste;
        this.dnevnica = dnevnica;
        this.sati = sati;
        this.smena = smena;
    }

    public String getIme() {
        return ime;
    }

    public String getPozicija() {
        return pozicija;
    }

    public int getGodiste() {
        return godiste;
    }

    public int getDnevnica() {
        return dnevnica;
    }

    public int getSati() {
        return sati;
    }

    public int getSmena() {
        return smena;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public void setDnevnica(int dnevnica) {
        this.dnevnica = dnevnica;
    }

    public void setSati(int sati) {
        this.sati = sati;
    }

    public void setSmena(int smena) {
        this.smena = smena;
    }

    /*@Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }*/
    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (!(object instanceof Zaposleni)) {
            return false;
        }

        Zaposleni zaposleniKojiSePoredi = (Zaposleni) object;

        return this.getIme().equals(zaposleniKojiSePoredi.getIme())
                && this.getPozicija().equals(zaposleniKojiSePoredi.getPozicija())
                && this.getGodiste()==zaposleniKojiSePoredi.getGodiste()
                && this.getDnevnica()==zaposleniKojiSePoredi.getDnevnica()
                && this.getSati()==zaposleniKojiSePoredi.getSati()
                && this.getSmena()==zaposleniKojiSePoredi.getSmena();

    }

    @Override
    public String toString() {
        return "Zaposleni{" +
                "ime='" + ime + '\'' +
                ", pozicija='" + pozicija + '\'' +
                ", godiste=" + godiste +
                ", dnevnica=" + dnevnica +
                ", sati=" + sati +
                ", smena=" + smena +
                '}';
    }
}
