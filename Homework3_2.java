/**
 * Java-1 Homework 3
 * @author Timofei Tokarev
 * @version dated 18.07.18
 */

import java.util.Random;
import java.util.Scanner;

public class Homework3_2 {

    private static String[] arr={"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    private static String word;
    private static String input;
    private static String guess;
    private static Scanner scanner;
    private static Random random;
    private static int fruitIndex;

    public static void main(String[]args){
        System.out.println("Игра 'Угадай плод'");
        scanner=new Scanner(System.in);
        random=new Random();
        toBegin();
    }
    private static void toBegin(){
        System.out.println("# # # # # # # # # # # # # # # ");
        fruitIndex=random.nextInt(arr.length);
        word=arr[fruitIndex];
        play();
    }
    private static void play() {
        do {
            input =scanner.next();
            guess = input + "#########";
            for (int i = 0; i < word.length(); i++) {
                if (guess.charAt(i)!= word.charAt(i))
                    System.out.print("# ");
                else{
                    System.out.print(word.charAt(i) + " ");
                }
            }
            if (!input.equals(word))
                for (int i=0; i<15-word.length();i++)
                    System.out.print("# ");
            System.out.println();
        }while (!input.equals(word));
        System.out.print("- Вы угадали!");
        exit();
    }
    private static void exit(){
        System.out.println();
        System.out.println("- Хотите сыграть еще?(y/n)");
        String input=scanner.next();
        char ans=input.charAt(0);
        if (ans == 'y'|| ans=='н')
            toBegin();
        else
            System.out.println("- До свидания!");

    }
}
