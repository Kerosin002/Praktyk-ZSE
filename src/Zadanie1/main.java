package Zadanie1;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Informacja o uczniu");
        uczen ON = new uczen();
        ON.setInfoOUczniu("Oleksandr","Nychyporchuk",18);
        ON.info(ON.Imie, ON.Nazwisko, ON.wiek);

    }
}
