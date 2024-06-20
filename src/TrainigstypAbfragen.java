import java.util.Scanner;

public class TrainigstypAbfragen {

    public void trainiere(Vokabel[] vokabeln) {
        for (int i = 0; i <= vokabeln.length - 1; i++) {
            Vokabel v = vokabeln[i];
            this.trainiereVokabel(v);
        }
    }

    //METHODE Vokabel abfragen
    private void trainiereVokabel(Vokabel v) {
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
