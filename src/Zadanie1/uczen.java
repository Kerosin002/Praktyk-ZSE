package Zadanie1;

public class uczen {
    String Imie;
    String Nazwisko;
    int wiek;

    public void set_all(String Imie, String Nazwisko, int wiek){
        this.Imie= Imie;
        this.Nazwisko=Nazwisko;
        this.wiek= wiek;
    }

    public void info(String Imie, String Nazwisko, int wiek) {
        System.out.println(Imie);
        System.out.println(Nazwisko);
        System.out.println(wiek);
    }
}
