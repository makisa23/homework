package automobili;

import java.util.ArrayList;


public class Automobil {


    private String marka;
    private String boja;
    private int brSasije;
    private int godiste;
    private int cena;

    public Automobil(String marka, String boja, int brSasije, int godiste, int cena) {
        this.marka = marka;
        this.boja = boja;
        this.brSasije = brSasije;
        this.godiste = godiste;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public int getBrSasije() {
        return brSasije;
    }

    public void setBrSasije(int brSasije) {
        this.brSasije = brSasije;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void oldTimer() {

    }

    public  ArrayList<Automobil> automobili(){
        return automobili();
    }

    @Override
    public String toString() {
        return "automobili.Automobil{" +
                "marka='" + marka + '\'' +
                ", boja='" + boja + '\'' +
                ", brSasije=" + brSasije +
                ", godiste=" + godiste +
                ", cena=" + cena +
                '}';
    }

    public ArrayList<Automobil> cenaManja(int svotaNovca,ArrayList<Automobil> automobili) {

        automobili= new ArrayList<>();
        Automobil automobil1 = new Automobil("Mercedes", "bela", 12345, 1998, 10000);
        Automobil automobil2 = new Automobil("BMW", "bela", 123789, 1993, 7000);
        automobili.add(automobil1);
        automobili.add(automobil2);
        ArrayList<Automobil> cenaManja = new ArrayList<>();
        for (int i = 0; i < automobili.size(); i++) {
            if (automobili.get(i).getCena() < svotaNovca) {
                cenaManja.add(automobili.get(i));
            }
        }
        for (int i = 0; i < cenaManja.size(); i++) {
            System.out.println(cenaManja.get(i));
            }
        return cenaManja;

    }



    public ArrayList<Automobil> sviBeli(ArrayList<Automobil> automobili) {
        ArrayList<Automobil> sviBeli= new ArrayList<>();
        automobili= new ArrayList<>();
        Automobil automobil1 = new Automobil("Mercedes", "bela", 12345, 1998, 10000);
        Automobil automobil2 = new Automobil("BMW", "bela", 123789, 1993, 7000);
        automobili.add(automobil1);
        automobili.add(automobil2);
        for (int i = 0; i < automobili.size(); i++) {
            if (automobili.get(i).getBoja().equalsIgnoreCase("bela")) {
                sviBeli.add(automobili.get(i));
            }

        }
        for (int i = 0; i < sviBeli.size(); i++) {
           System.out.println(sviBeli.get(i));
        }
        return sviBeli;
    }

    public static void main(String[] args) {
         ArrayList<Automobil> automobili = new ArrayList<>();
        Automobil automobil1 = new Automobil("Mercedes", "bela", 12345, 1998, 10000);
        Automobil automobil2 = new Automobil("BMW", "bela", 123789, 1993, 7000);
        automobili.add(automobil1);
        automobili.add(automobil2);

        automobil1.sviBeli(automobili);
        automobil2.cenaManja(8000,automobili);

    }
}