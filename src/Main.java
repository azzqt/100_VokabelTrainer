import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//Vokabel als Objekt erzeuge, mit Standardwerten-Konstruktor deutsch u englisch
        Vokabel v1 = new Vokabel("Hund", "Dog");
        Vokabel v2 = new Vokabel("Katze", "Cat");

        VokabelListe vl = new VokabelListe();
        vl.addVokabel(v1);
        vl.addVokabel(v2);

        String eingabe;
        Scanner sc = new Scanner(System.in);

        System.out.println("Willkommen zum Vokabeltrainer!");
        System.out.println("Neue Vokabel (n), neues Training (t), Beenden (x)");
        eingabe = sc.next();

//Spielstart, Abfrage nach neuer Runde
        while (!eingabe.equalsIgnoreCase("x")) { //spiel laeuft solange man nicht X drueckt

            if (eingabe.equalsIgnoreCase("t")) {

                //training starten
                System.out.println("Trainingsmodus: Einprägen(1) oder Abfragen(2)");
                int modus = Integer.parseInt(sc.next());
                Vokabel[] vokabeln = vl.getVokabeln();

                if (modus == 1) {
                    TrainingstypLernen t = new TrainingstypLernen();
                    t.trainiere(vokabeln);
                }

                if (modus == 2) {
                    TrainigstypAbfragen t = new TrainigstypAbfragen();
                    t.trainiere(vokabeln);
                }
            }
            if (eingabe.equalsIgnoreCase("n")) {//eigene neue vokabel anlegen

                System.out.println("Vokabel deutsch:");
                String vd = sc.next();
                System.out.println("Vokabel englisch:");
                String ve = sc.next();
                Vokabel v = new Vokabel(vd, ve);         //neue vokabel erschaffen mit konstruktor standardwert deutsch und englisch
                vl.addVokabel(v);

            }

            System.out.println("Neue Vokabel (n), neues Training (t), Beenden (x)");
            eingabe = sc.next();
        }

        System.out.println("Du hast " + v1.getAnzahl_trainings() + " Runden gespielt");
        System.out.println("Erfolgsquote: " + v1.getErfolgsquote());
    }


}
