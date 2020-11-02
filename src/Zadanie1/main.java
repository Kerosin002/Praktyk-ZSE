package Zadanie1;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Informacja o uczniu");
        uczen uczen = new uczen();
        uczen.Imie=in.next();
        uczen.Nazwisko=in.next();
        uczen.wiek=in.nextInt();

        uczen.set_all(uczen.Imie, uczen.Nazwisko, uczen.wiek);
        uczen.info(uczen.Imie, uczen.Nazwisko, uczen.wiek);

    }
}
