public class D_05 {
    public static void main(String[] args) {
        String rec = "ITBootCamp";
            char karakter = 'C';
        for (int i = 0; i < rec.length(); i++) {
               char slovo = rec.charAt(i);

            if (karakter == slovo) {
                continue;
            }
            System.out.print(slovo);
        }


    }
}
