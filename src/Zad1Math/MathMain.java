package Zad1Math;
import java.util.Scanner;

public class MathMain {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("1 -- podniesienie liczby do 3 potegi");
        System.out.println("2 -- suma, roznica i iloczyn dwoch liczb");
        System.out.println("3 -- sprawdzanie, czy wprowadzone liczby sa stronami trojkata prostokatnego");
        int i= in.nextInt();

        switch(i){
            case 1:
                System.out.println("Wprowadz liczbe");
                double x= in.nextDouble();
                System.out.println(Matma.potega3(x));
                break;
            case 2:
                System.out.println("Wprowadz pirwsza liczbe");
                x= in.nextDouble();
                System.out.println("Wprowadz druga liczbe");
                double y= in.nextDouble();
                System.out.println(Matma.mathOperP(x,y));
                System.out.println(Matma.mathOperM(x,y));
                System.out.println(Matma.mathOperPON(x,y));
                break;
            case 3:
                System.out.println("Wprowadz pirwsza liczbe");
                x= in.nextDouble();
                System.out.println("Wprowadz druga liczbe");
                y= in.nextDouble();
                System.out.println("Wprowadz trzecia liczbe");
                double z= in.nextDouble();
                System.out.println(Matma.trojkat(x,y,z));
                break;
        }

    }
}
