package czwiczenieNaLekcji;

public class Kwiatek {
    String kolorLisci="Zielony";
    String nazwa;
    String nazwaLacinska;
    String kolorPlatkow;
    boolean czyTrujacy;
    String zadkoscWystepowania;

    public Kwiatek(String nazwa, String nazwaLacinska, String kolorPlatkow, boolean czyTrujacy, String zadkoscWystepowania) {
        this.nazwa = nazwa;
        this.nazwaLacinska = nazwaLacinska;
        this.kolorPlatkow = kolorPlatkow;
        this.czyTrujacy = czyTrujacy;
        this.zadkoscWystepowania = zadkoscWystepowania;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setNazwaLacinska(String nazwaLacinska) {
        this.nazwaLacinska = nazwaLacinska;
    }

    public void setKolorPlatkow(String kolorPlatkow) {
        this.kolorPlatkow = kolorPlatkow;
    }

    public void setCzyTrujacy(boolean czyTrujacy) {
        this.czyTrujacy = czyTrujacy;
    }

    public void setZadkoscWystepowania(String zadkoscWystepowania) {
        this.zadkoscWystepowania = zadkoscWystepowania;
    }


}
