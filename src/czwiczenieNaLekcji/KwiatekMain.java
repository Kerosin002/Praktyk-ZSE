package czwiczenieNaLekcji;

public class KwiatekMain {

    public static void main(String[] args) {
        Kwiatek kwiatek1 = new Kwiatek("Roza", "Rosa", "Czerwony",false, "Nie czesto");
        
        kwiatek1.setNazwa("stokrotka");
        kwiatek1.setNazwaLacinska("Bellis");
        kwiatek1.setKolorPlatkow("Bialy");
        kwiatek1.setCzyTrujacy(false);
        kwiatek1.setZadkoscWystepowania("Bardzo czesto");
    }
}
