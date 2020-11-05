package Zad1Math;

public class Matma {
    static double Pi= 3.14;
    static double E=2.71;
    public static double potega3(double x){
        double y= x*x*x;
        return y;
    }
    public static double mathOperP(double x, double y) {
        double z = x + y;
        return z;
    }
    public static double mathOperM(double x, double y) {
       double z = x - y;
       return  z;
    }
    public static double mathOperPON(double x, double y) {
        double z = x * y;
        return z;
    }
    public static boolean trojkat(double x, double y, double z){
        boolean p=false;
        if((z*z==(x*x)+(y*y))||(x*x==(y*y)+(z*z))||(y*y==(x*x)+(z*z))){
            p=true;
        }
        return p;
    }
}
