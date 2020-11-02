package UCZEN;

public class main {
    public static void main(String[] args){
        System.out.println("Informacja o uczniu");
        uczen uczen = new uczen();
        uczen.set_all("Oleksandr","Nychyporchuk",18);
        uczen.info(uczen.Imie, uczen.Nazwisko, uczen.wiek);

    }
}
