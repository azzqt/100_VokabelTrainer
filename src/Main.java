import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Vokabel v1 = new Vokabel();
        v1.vokabel_deutsch="Hund";
        v1.vokabel_englisch="Dog";

        Vokabel v2 = new Vokabel();
        v2.vokabel_deutsch="Katze";
        v2.vokabel_englisch="Cat";

        String neue_runde = "nein";


        Scanner sc = new Scanner(System.in);

        System.out.println("Willkommen zum Vokabeltrainer!");
        System.out.println("Neue Trainingsrunde? ja/nein");
        neue_runde = sc.next();

        while (neue_runde.equalsIgnoreCase("ja")) {   //Abfrage nach neuer Runde

            trainiereVokabel(v1);
            trainiereVokabel(v2);

            System.out.println("Neue Trainingsrunde? ja/nein");
            neue_runde = sc.next();
        }

        System.out.println("Du hast "+v1.anzahl_trainings +" Runden gespielt");

    }
    private static void trainiereVokabel(Vokabel v){
        v.anzahl_trainings++;

        Scanner sc = new Scanner(System.in);

        System.out.println(v.vokabel_deutsch);
        System.out.println("Gib die Übersetzung ein!");

        String uebersetzung = sc.next();

        if (uebersetzung.equalsIgnoreCase(v.vokabel_englisch)) {  //Vergleich ob Vokabel korrekt
            System.out.println("Das ist richtig!");
            v.anzahl_erfolgreich++;
        } else {
            System.out.println("Das ist falsch!");
            System.out.println("Richtige Lösung anzeigen ? ja/nein");
            String loesen = sc.next();
            if(loesen.equalsIgnoreCase("ja")){
                System.out.println(v.vokabel_englisch+" <<< richtige Vokabel");
            }

        }
    }
}
