package jelo;

public class Jelo {
    /*
Domaci:
Klasa Jelo:
-String naziv
-double cena
-String vrsta // Meksicko, Italijansko,..
Klasa Restoran:
-String naziv
-Jelo[] meni // moze da se napravi i kao lista
-int brSlobodnihStolova
Interfejs Guzva implementira metode:
-napraviti metodu koja ce istampati najskuplje jelo na meniju - Jelo najskuplje()
-napraviti metodu za rezervaciju stola (ako ima slobodnih stolova) - void rezervisiSto() //ako ima slobodnih stolova, smanjiti broj stolova za 1
-napraviti metod za stampu naziva svih jela neke odredjene vrste - void  StampajNaziveJela(String vrsta)
Klasa Restoran implementira interfejs Guzva
*Implementirati sve potrebne get i set metode, zajedno sa toString()*/
    private String naziv;
    private double cena;
    private String vrsta;

    public Jelo(String naziv, double cena, String vrsta) {
        this.naziv = naziv;
        this.cena = cena;
        this.vrsta = vrsta;
    }

    public Jelo() {

    }


    public String getNaziv() {
        return naziv;
    }

    public double getCena() {
        return cena;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Jelo{" +
                "naziv='" + naziv + '\'' +
                ", cena=" + cena +
                ", vrsta='" + vrsta + '\'' +
                '}';
    }
}
