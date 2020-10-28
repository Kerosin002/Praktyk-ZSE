
package basic;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int a = 12;
        double f = 4.5;
        float af = 5.6f;
        String s = "hello ";
        boolean b = true;
        int[] array = {1,2,3};

       final int c = 19;
       double k=a+f;
       System.out.println("Hello world " + (a+af+f) + " " + af + " " + 15);
       int p = in.nextInt();

       if (a>p)
       {
           System.out.println("Переменная А больше чем P");
       }
       else {
           System.out.println("Переменная А меньше чем P");
       }
       in.close();
    }
}
