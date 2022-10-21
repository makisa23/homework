package namirnice;

public class Namirnica {
    /*Domaci:
Napraviti Klasu Namirnica:
-String naziv
-double cena
Interfejs Racun:
-metod za listanje svih namirnica
    void printNamernice()
-metod za ispis ukupnog iznosa racuna svih namirnica
    int printRacun()
-metod koji vraca true ukoliko se namirnica nalazi na spisku
    boolean jeNaSpisku(Namirnica n)
Klasa Korpa implementira Racun i ima:
-Listu namirnica
*Implementirati sve get, set i toString metode*/
    private String naziv;
    private double cena;


    public Namirnica(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public Namirnica(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Namirnica{" +
                "naziv='" + naziv + '\'' +
                ", cena=" + cena +
                '}';
    }
}
