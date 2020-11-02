package Delta;
import java.util.Scanner;

public class DeltaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Wprowadz a");
        int a= in.nextInt();
        System.out.println("Wprowadz b");
        int b= in.nextInt();
        System.out.println("Wprowadz c");
        int c= in.nextInt();
        int d=(b*b)- 4*a*c;
        System.out.println("Delta jest rowna "+d);

        if(d>0){
            System.out.println("Rownanie ma 2 rozwiazania");
            double x1=((-1*b)+Math.sqrt(d))/(2*a);
            double x2=((-1*b)-Math.sqrt(d))/(2*a);
            System.out.println(x1+" i "+x2);
        }
        if(d<0){
            System.out.println("Rownanie nie ma rozwiazan");
        }
        if (d==0){
            System.out.println("Rownanie ma 1 rozwiazanie");
            double x1=((-1*b)+Math.sqrt(d))/(2*a);
            System.out.println(x1);
        }
    }
}
