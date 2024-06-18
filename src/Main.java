import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String vokabel_deutsch = "Hund";
        String vokabel_englisch = "Dog";
        String neue_runde = "nein";

        Scanner sc = new Scanner(System.in);

        System.out.println("Willkommen zum Vokabeltrainer!");
        System.out.println("Neue Trainingsrunde? ja/nein");
        neue_runde = sc.next();

        while (neue_runde.equalsIgnoreCase("ja")) {   //Abfrage nach neuer Runde
            System.out.println(vokabel_deutsch);
            System.out.println("Gib die Übersetzung ein!");
            String uebersetzung = sc.next();
            if (uebersetzung.equalsIgnoreCase(vokabel_englisch)) {  //Vergleich ob Vokabel korrekt
                System.out.println("Das ist richtig!");
            } else {
                System.out.println("Das ist falsch!");
            }
            System.out.println("Neue Trainingsrunde? ja/nein");
            neue_runde=sc.next();
        }


    }
}
