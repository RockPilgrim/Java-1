/**
 * Java-1 Homework 3
 * @author Timofei Tokarev
 * @version dated 18.07.18
 */
import java.util.Random;
import java.util.Scanner;

public class Homework3_1 {

    private static Scanner scanner;
    private static int range;
    private static int effots;
    private static int enter;
    private static Random random;
    private static int min;
    private static int max;
    private static final String LOSE="lose";
    private static final String WIN="win";
    private static String res;

    public static void main(String[] args){

        scanner=new Scanner(System.in);

        range=9;                        // Количество чисел
        effots=3;                       // Попытки

        random=new Random();
        System.out.println("Угадайте число");
        toBegin();
    }
    private static void toBegin(){
        res=LOSE;   // Все уже решено :)
        max=range;
        min=0;
//        int random=(int)(Math.random()*(range+1)); // первый способ
        int num=random.nextInt(range+1);  // второй способ
        play(num);
    }
    private static void play(int num){
        for (int i=0;i<effots;i++){
            enter=getNumber();
            if (enter>num){
                max=enter;
                System.out.println("Число меньше");
            }else if (enter<num){
                min=enter;
                System.out.println("Число больше");
            }else{
                res=WIN;
                break;
            }
        }
        exit(res);
    }
    private static int getNumber(){
        int x;
        do {
            System.out.println("Введите число от "+min+" до "+max);
            x=scanner.nextInt();
        }while (x<min || x>max);
        return x;
    }
    private static void exit(String result){
        if (result==WIN)
            System.out.println("Вы победили!");
        else
            System.out.println("В следующий раз повезет");
        System.out.println("Хотите сыграть еще?(y/n)");
        String input=scanner.next();
        char ans=input.charAt(0);
        if (ans == 'y'|| ans=='н')
            toBegin();
        else
            System.out.println("До свидания!");
//        if (input == "y"){   /// Такой вариант почему-то не работает
//            toBegin();
//        }
    }
}
