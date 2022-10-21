package jelo;



import java.util.ArrayList;

public class Restorani extends Jelo implements Guzva {
    private String naziv;
    private ArrayList<Jelo> jelovnik;
    private int brSlobodnihStolova;

    public Restorani(String naziv, ArrayList<Jelo> jelovnik, int brSlobodnihStolova) {
        super();
        this.naziv = naziv;
        this.jelovnik = jelovnik;
        this.brSlobodnihStolova = brSlobodnihStolova;
    }


    public String getNaziv() {
        return naziv;
    }

    public ArrayList<Jelo> getJelovnik() {
        return jelovnik;
    }

    public int getBrSlobodnihStolova() {
        return brSlobodnihStolova;
    }

    public void setJelovnik(ArrayList<Jelo> jelovnik) {
        this.jelovnik = jelovnik;
    }

    public void setBrSlobodnihStolova(int brSlobodnihStolova) {
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    @Override
    public String toString() {
        return "Restoran{" +
                "naziv='" + naziv + '\'' +
                ", jelovnik=" + jelovnik +
                ", brSlobodnihStolova=" + brSlobodnihStolova +
                '}';
    }

    @Override
    public double najskupljeJelo(double cena) {
        double najskupljeJelo = jelovnik.get(0).getCena();
        for (int i = 1; i < jelovnik.size(); i++) {
            if(jelovnik.get(i).getCena() > najskupljeJelo){
                najskupljeJelo=jelovnik.get(i).getCena();
            }

        }
        System.out.println(najskupljeJelo);
        return najskupljeJelo;
    }

    @Override
    public void rezervisiSto(int brSlobodnihStolova) {
        boolean rezervacija = false;

            if (getBrSlobodnihStolova() != 0) {
                rezervacija = true;
                setBrSlobodnihStolova(getBrSlobodnihStolova() - 1);
                System.out.println(rezervacija);
                System.out.println
                        ("Broj preostalih stolova u restoranu " + getNaziv() + " je: " + getBrSlobodnihStolova());
            } else {
                System.out.println("Nema slobodnih stolova");
            }

        }


    @Override
    public void StampajNaziveJela(String vrsta) {
        for (int i = 0; i < getJelovnik().size() ; i++) {
            if (jelovnik.get(i).getVrsta().equalsIgnoreCase(vrsta)){
                System.out.println(jelovnik.get(i));
            }
        }

    }
}
