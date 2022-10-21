package namirnice;

import java.util.ArrayList;

public class Korpa  implements Racun{
    private ArrayList<Namirnica> namirnice;

    public Korpa(ArrayList<Namirnica> namirnice) {
        this.namirnice = namirnice;
    }

    public ArrayList<Namirnica> getNamirnice() {
        return namirnice;
    }

    public void setNamirnice(ArrayList<Namirnica> namirnice) {
        this.namirnice = namirnice;
    }

    @Override
    public void printNamirnice() {
        for (Namirnica namirnica: namirnice )
        {
            System.out.println(namirnica);
        }
    }

    @Override
    public int printRacun() {
      double suma =0;
      for (Namirnica namirnica : namirnice){
          suma+= namirnica.getCena();
      }
        System.out.println(suma);
        return (int)suma;
    }

    @Override
    public boolean jeNaSpisku(Namirnica namirnica) {
        boolean naSpisku = false;
        for (Namirnica namirnice : namirnice){
            if(namirnice.getNaziv().equalsIgnoreCase(namirnica.getNaziv())){
                naSpisku =  true;
            }
        }
        System.out.println(naSpisku);
        return naSpisku;
    }

    public static void main(String[] args) {
        ArrayList<Namirnica> namirnice = new ArrayList<>();
        Namirnica jabuka = new Namirnica("budimka", 170);
        Namirnica breskva = new Namirnica("spanska", 150);
        Namirnica kruska = new Namirnica("viljamovka");
        namirnice.add(jabuka);
        namirnice.add(breskva);
        Korpa korpa = new Korpa(namirnice);
        korpa.jeNaSpisku(jabuka);
        korpa.jeNaSpisku(kruska);
        korpa.printNamirnice();
        korpa.printRacun();
    }


}
