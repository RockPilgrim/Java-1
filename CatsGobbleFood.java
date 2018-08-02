/**
 * Java 1 Homework 7
 *
 * @author Timofei Tokarev
 * @dated 2.08.18
 * @link https://github.com/RockPilgrim
 */
import java.util.Scanner;

public class CatsGobbleFood {

    Cat[] cats={new Cat("Vasya",5),
            new Cat("Dasya",10),
            new Cat("Sasya",7),
            new Cat("Rasya",6)};
    Plate plate=new Plate(20);
    Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        new CatsGobbleFood();
    }
    CatsGobbleFood(){
        plate.info();
        feedCats();
    }
    void feedCats(){
        for (Cat cat:cats) {
            cat.eatFrom(plate);
            cat.checkCat();
        }
        addFood();
    }
    void addFood(){
        System.out.println("Add food for cats? (y/n)");
        String input=scanner.next();
        char ans=input.charAt(0);
        if (ans == 'y'|| ans=='н'){
            System.out.println("How much?");
            plate.addFood(scanner.nextInt());
            feedCats();
        }
        else
            System.out.println("Good bye take care!");
    }
}
//////// CAT CAT CAT CAT CAT CAT ///////////
class Cat {
    private String name;
    private int appetite;
    private boolean isFull=false;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    void eatFrom(Plate plate) {
        if (plate.checkFood()>=appetite){
            plate.descreaseFood(appetite);
            appetite=0;
            isFull=true;
        }
    }
    void checkCat(){
        System.out.println("\""+name+"\" "+isFull+" "+appetite);
    }
}

//////// PLATE PLATE PLATE PLATE ///////////
class Plate{
    private int food;
    Plate(int food){
        this.food=food;
    }
    void descreaseFood(int n){
        if (n<=food)
            food-=n;
    }
    int checkFood(){
        return food;
    }
    void addFood(int f){
        food+=f;
    }
    void info(){
        System.out.println("Plate: "+food+" food ammount");
    }
    @Override
    public String toString(){
        return ("Plate: "+food+" food ammount");
    }
}
