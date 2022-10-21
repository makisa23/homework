

public class Ucenik {
  private String ime;
  private String prezime;
  private int godine;
  private int [] ocene;

    public Ucenik(String ime, String prezime, int godine, int[] ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.ocene = ocene;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodine() {
        return godine;
    }

    public int[] getOcene() {
        return ocene;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public void setOcene(int[] ocene) {
        this.ocene = ocene;
    }
    public static String notifikacija (int [] ocene){
        int brojac = 0;
        String notifikacija="";
        for (int i = 0; i < ocene.length; i++) {
            if (ocene[i] == 1){
                brojac++;
                notifikacija="Imate " + brojac + " jedinicu/e.";

            }
        }
            System.out.println(notifikacija);
        return notifikacija;
    }
    public static double prosek (int [] ocene){
        double prosekOcena = 0;
        for (int i = 0; i < ocene.length; i++) {
            prosekOcena += ocene[i];

        }
        System.out.println(prosekOcena/ocene.length);
        return prosekOcena / ocene.length;
    }
    public static void main(String[] args) {

        Ucenik ucenik1 = new Ucenik("Marina", "Botoric", 27, new int []{5,5,1,4,5});
        System.out.println(ucenik1.getIme());
        System.out.println(ucenik1.getPrezime());
        notifikacija(ucenik1.getOcene());
        prosek(ucenik1.getOcene());

    }
}
