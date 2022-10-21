package zaposleni;

import java.util.ArrayList;

public class TestRestoran {
    public static void main(String[] args) {
        ArrayList<Zaposleni> listaZaposlenih = new ArrayList<>();
        listaZaposlenih.add
                (new Konobar("pera","konobar",1995,2000,8,1));
        listaZaposlenih.add
                (new Konobar("zika", "konobar",1994,2000,8,1));
        listaZaposlenih.add
                (new Konobar("mika", "konobar",1993,2000,8,3));
        listaZaposlenih.add
                (new Kuvar("laza", "kuvar",1992,2500,8,1));
        listaZaposlenih.add
                (new Kuvar("nesa", "kuvar",1991,2500,8,2));
        listaZaposlenih.add
                (new Kuvar("joca", "kuvar",1990,2500,8,3));
        listaZaposlenih.add
                (new Zaposleni("caki","konobar", 1989,2000,8,2));
        listaZaposlenih.add
                (new Zaposleni("coco", "kuvar", 1988,2500,8,3));
        Restoran zaposleni = new Restoran(listaZaposlenih);

        zaposleni.stampajKonobare(1);
        zaposleni.povecajCenuTrecojSmeni(listaZaposlenih);
    }
}
