package HuMech;

public class Mechanic extends Human {
    int doswiadczenie_zawodowe; //w latach;
    boolean jest_do_dyspozycji;
    String imie;
    String nazwisko;

    public Mechanic(double wzrost, char plec, double rozmiar_buta, boolean czy_lysy, String color_wlosow, int wiek, Human[] rodzice, int doswiadczenie_zawodowe, boolean jest_do_dyspozycji, String imie, String nazwisko) {
        super( wzrost, plec, rozmiar_buta, czy_lysy, color_wlosow, wiek, rodzice);
        this.doswiadczenie_zawodowe = doswiadczenie_zawodowe;
        this.jest_do_dyspozycji = jest_do_dyspozycji;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}
