public class VokabelListe {

    Vokabel[] vokabelnArray = new Vokabel[10]; //Array vom datentyp VOKABEL erzeugen

    int index = 0;// speichert, die menge an vokabeln im array

    //Methode zum hinzufügen neuer Vokabel
    public void addVokabel(Vokabel v) {
        if (index == vokabelnArray.length) { //wenn array voll, dann rufe methode resize array auf um zu vergroessern
            resizeArray();
        }
        vokabelnArray[index] = v;
        this.index++;
    }

    //Methode zum anzeigen lassen der Vokabel
    public Vokabel[] getVokabeln() {

        Vokabel[] kopie = new Vokabel[index];

        for (int i = 0; i <= index - 1; i++) {
            kopie[i] = vokabelnArray[i];
        }
        return kopie;
    }

    //Methode zum vergroessern des Arrays, wenn voll
    private void resizeArray() {

        Vokabel[] vn = new Vokabel[vokabelnArray.length + 10];
        for (int i = 0; i <= vokabelnArray.length - 1; i++) {
            vn[i] = vokabelnArray[i];
        }
    }

}
