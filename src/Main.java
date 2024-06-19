import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //Vokabel als Objekt erzeuge, mit Standardwerten-Konstruktor deutsch u englisch
        Vokabel v1 = new Vokabel("Hund","Dog");
        Vokabel v2 = new Vokabel("Katze", "Cat");

        String neue_runde = "nein";
        Scanner sc = new Scanner(System.in);

        System.out.println("Willkommen zum Vokabeltrainer!");
        System.out.println("Neue Trainingsrunde? ja/nein");
        neue_runde = sc.next();

//Abfrage nach neuer Runde
        while (neue_runde.equalsIgnoreCase("ja")) {
//Methoden Vokabelabfrage aufrufen
            trainiereVokabel(v1);
            trainiereVokabel(v2);
            System.out.println("Neue Trainingsrunde? ja/nein");
            neue_runde = sc.next();
        }

        System.out.println("Du hast " + v1.getAnzahl_trainings() + " Runden gespielt");
        System.out.println("Erfolgsquote: "+v1.getErfolgsquote());
    }

//METHODE Vokabel abfragen
    private static void trainiereVokabel(Vokabel v) {
        v.update_anzahlTrainings();

        Scanner sc = new Scanner(System.in);

        System.out.println(v.getVokabel_deutsch());
        System.out.println("Gib die Übersetzung ein!");

        String uebersetzung = sc.next();
//Vergleich ob Vokabel korrekt
        if (uebersetzung.equalsIgnoreCase(v.getVokabel_englisch())) {
            System.out.println("Das ist richtig!");
            v.update_anzahlErfolgreich();
        } else {
            System.out.println("Das ist falsch!");
            System.out.println("Richtige Lösung anzeigen ? ja/nein");
            String loesen = sc.next();
            if (loesen.equalsIgnoreCase("ja")) {
                System.out.println(v.getVokabel_englisch() + " <<< richtige Vokabel");
            }

        }
    }
}
