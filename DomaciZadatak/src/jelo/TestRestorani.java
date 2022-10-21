package jelo;

import java.util.ArrayList;

public class TestRestorani {
    public static void main(String[] args) {
        ArrayList<Jelo> jelovnik = new ArrayList<>();
        jelovnik.add (new Jelo("pasta", 600.00, "italijansko" ));
        jelovnik.add (new Jelo("tortilja", 700.00, "meksicko" ));
        jelovnik.add (new Jelo("pljeskavica", 300.00, "srpsko" ));
        jelovnik.add (new Jelo("susi", 900.00, "japansko" ));
        jelovnik.add (new Jelo("pizza", 400.00, "italijansko" ));
        jelovnik.add (new Jelo("burito", 700.00, "meksicko" ));
        Restorani restoran = new Restorani("Botako", jelovnik, 3);
        restoran.rezervisiSto(restoran.getBrSlobodnihStolova());
        restoran.najskupljeJelo(restoran.getCena());
        restoran.StampajNaziveJela("italijansko");



    }
}
