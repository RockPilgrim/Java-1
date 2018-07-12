/**
 *Java 1 Homework 1
 * @author Timofei Tokarev
 * @version dated 12.07.18
 */

public class Java1HW1{

    private static int a=10;
    static byte b=10;
    static short sh=85;
    static long l=856;
    static float f=8.00005f;
    static double d=17.568;
    static boolean bu=false;
    static char ch='F';
    static String str="Operation= ";

    public static void main(String[] args){
        int c=8;
        int opr=(int) (a*(b+c/d)); // для удобства я округлил ответ
        helloName("Tima");
        System.out.println(str + opr);
        compareOneNum(-85);
        compareTwoNum(opr,8);
        setYear(8);     // проверки
        setYear(200);   // проверки
        setYear(300);   // проверки
        setYear(800);   // проверки
    }
    private static void compareOneNum (int a){
        if (a>=0){
            System.out.println("Число положительное");
        }else
            System.out.println("Число отрицательное");
    }
    private static boolean compareTwoNum (int a,int b){
        if (a+b >= 10 && a+b <=20){
            bu =true;
        }else {
            bu=false;
        }
        return bu;
    }
    private static void helloName (String name){
        System.out.println("Привет, "+name);
    }
    private static void setYear (int y){
        if ((y%4==0 && y%100!=0) || y%400==0 ){
            System.out.println("Год високосный");
        }else System.out.println("Год не високосный");
    }
}