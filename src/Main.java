import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//Vokabel als Objekt erzeuge, mit Standardwerten-Konstruktor deutsch u englisch
        Vokabel v1 = new Vokabel("Hund", "Dog");
        Vokabel v2 = new Vokabel("Katze", "Cat");

        Vokabel[] vokabelnArray = new Vokabel[10]; //Array vokabeldatentyp erzeugen
        vokabelnArray[0] = v1;
        vokabelnArray[1] = v2;
        int index = 2;// speichert, die menge an vokabeln im array


        String eingabe;
        Scanner sc = new Scanner(System.in);

        System.out.println("Willkommen zum Vokabeltrainer!");
        System.out.println("Neue Vokabel (n), neues Training (t), Beenden (x)");
        eingabe = sc.next();

//Spielstart, Abfrage nach neuer Runde
        while (!eingabe.equalsIgnoreCase("x")) { //spiel laeuft solange man nicht X drueckt
            if (eingabe.equalsIgnoreCase("t")) {  //training starten

                //Methoden Vokabelabfrage aufrufen
                for (int i = 0; i <= index - 1; i++) {

                    Vokabel v = vokabelnArray[i];
                    trainiereVokabel(v);

                }


            }
            if (eingabe.equalsIgnoreCase("n")) {//eigene neue vokabel anlegen
              if(index< vokabelnArray.length){
                System.out.println("Vokabel deutsch:");
                String vd = sc.next();
                System.out.println("Vokabel englisch:");
                String ve = sc.next();
                Vokabel v = new Vokabel(vd, ve);         //neue vokabel erschaffen mit konstruktor standardwert deutsch und englisch
                vokabelnArray[index] = v;
                index++;}
              else{
                  System.out.println("Kein freier Speicherplatz");
              }
            }


            System.out.println("Neue Vokabel (n), neues Training (t), Beenden (x)");
            eingabe = sc.next();
        }

        System.out.println("Du hast " + v1.getAnzahl_trainings() + " Runden gespielt");
        System.out.println("Erfolgsquote: " + v1.getErfolgsquote());
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
