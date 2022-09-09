public class Zmienne {
    public static void main(String[] args) {

        int numerButa;
        numerButa = 123;

        double number2, number3, number4;

        double number5 = 123.7;

        System.out.println("Liczba: " + numerButa);

        String text = "Jakiś \"fajny\" \n\t napis";

        char letter = 'a';
        boolean twierdzenie = true; //false


        if(twierdzenie){
            System.out.println("Sukces");
        }

        System.out.println("Mój napis " + text + " "+ numerButa);

        int podatek;

        int factor = 4;
        podatek = numerButa % factor;

        System.out.println("Mój \\napis " + text + " "+ numerButa);
        System.out.print("Mój \"napis\" \n" + text + " "+ numerButa);
        System.out.print("Mój napis \t" + text + " "+ numerButa);

        //https://github.com/przemjan/trzeciaPgr3
    }
}
