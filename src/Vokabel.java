public class Vokabel {
    //Private String damit man sie nicht ausversehen aendern kann
    private String vokabel_deutsch;
    private String vokabel_englisch;

    //Konstruktor der Standardwerte vorgibt die eingegeben werden muessen
    public Vokabel(String vokabel_deutsch, String vokabel_englisch) {

        this.vokabel_deutsch = vokabel_deutsch;
        this.vokabel_englisch = vokabel_englisch;
    }

    //public Zugriffs get methoden, damit die Vokabel lesbar wird
    public String getVokabel_deutsch() {
        return this.vokabel_deutsch;
    }

    public String getVokabel_englisch() {
        return this.vokabel_englisch;
    }

    //Private int damit man sie nicht ausversehen aendern kann
    private int anzahl_trainings = 0;
    private int anzahl_erfolgreich = 0;

    //Methode zum erhöhen der erfolgreichen und trainings
    public void update_anzahlTrainings() {
        anzahl_trainings++;
    }
    public void update_anzahlErfolgreich() {
        anzahl_erfolgreich++;
    }

    //Methoden zum Aufruf der absolvierten Trainings
    public int getAnzahl_trainings() {
        return anzahl_trainings;
    }
    //Erfolgsquoute berechnen in double wegen komma
    public double getErfolgsquote() {
        return (double) this.anzahl_erfolgreich / this.anzahl_trainings;
    }

}
