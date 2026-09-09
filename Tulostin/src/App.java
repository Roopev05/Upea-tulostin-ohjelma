public class App {
    public static void main(String[] args) throws Exception {
        //Tekijän nimeksi asetetaan Roope
        String tekija = "Roope Vilkman";
        //Asetetaan arvot luvuille 1 ja 2.
        double luku1 = 5;
        double luku2 = 2;
        //Tehdään tulo,erotus,summa ja jako muuttujat
        double erotus = 0;
        double tulo = 0;
        double summa = 0;
        double jako = 0;
        //Tehdään laskin joka tekee kaikki perus laskut luvulle 1 ja 2
        tulo = luku1 * luku2;
        erotus = luku1 - luku2;
        summa = luku1 + luku2;
        jako = luku1 / luku2;

        
        //Tulostetaan tekstiä
        System.out.println("Hei olen Tulostin-ohjelma");
        System.out.print("Ohjelman tekijä:");
        System.out.println(" " + tekija);
        

        //Tulostetaan luvut 1 ja 2 sekä niiden laskujen tulokset
        System.out.println("Luku1-muuttujan arvo on: " + luku1);
        System.out.println("Luku2-muuttujan arvo on: " + luku2);
        System.out.println(luku1 + " "+ "*" + " " + luku2 + " "+"=" + " " + tulo);
        System.out.println(luku1 + " "+ "-" + " " + luku2 + " "+"=" + " " + erotus);
        System.out.println(luku1 + " "+ "+" + " " + luku2 + " "+"=" + " " + summa);
        System.out.println(luku1 + " "+ "/" + " " + luku2 + " "+"=" + " " + jako);


    }
}
