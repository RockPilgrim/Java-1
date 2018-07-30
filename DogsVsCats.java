/**
 * Java 1 Homework 6
 *
 * @author Timofei Tokarev
 * @dated 29.07.18
 * @link https://github.com/RockPilgrim
 */

public class DogsVsCats {
    public static void main(String[] args) {
        Animal dog1=new Dog("Roy");
        Animal dog2=new Dog("Rex");
        Animal cat=new Cat("Manul");
        dog1.setAge(3);
        dog2.setAge(4);
        cat.setAge(2);
        System.out.println(dog1.getAge());
        if (dog1.run(500))
            System.out.println(dog1.getName()+" Can");
        if (dog2.run(480))
            System.out.println(dog2.getName()+" Can");
        if (cat.swim(1))
            System.out.println(cat.getName()+" can swin");
        else
            System.out.println(cat.getName()+" can\'t swin");
    }
}

abstract class  Animal{

    private String name;
    private int age=3;
    private double runForce;
    private double jumpForce;
    private double swimForce;
    private int maxRun;
    private double maxJump;
    private int maxSwim;

    public Animal(String name){
        this.name=name;
    }
    public void setAge(int age){
        if (age>0 && age<=15)
            this.age=age;
    }
    public int getAge(){
    return age;
    }
    public String getName(){
        return name;
    }
    protected void setParams( double runForce,
            double jumpForce,
            double swimForce,
            int maxRun,
            double maxJump,
            int maxSwim){
        this.runForce=runForce;
        this.maxRun=maxRun;
        this.jumpForce=jumpForce;
        this.maxJump=maxJump;
        this.swimForce=swimForce;
        this.maxSwim=maxSwim;
    }
    public boolean run(int distance) {
        if (distance <= (int) (maxRun - Math.abs(getAge() - 3) * runForce))
            return true;
        return false;
    }
    public boolean jump(double height) {
        if (height <= (int) (maxJump - Math.abs(getAge() - 3) * jumpForce))
            return true;
        return false;
    }
    public boolean swim(int distance) {
        if (distance <= (int) (maxSwim - Math.abs(getAge() - 3) * swimForce))
            return true;
        return false;
    }
}

class Dog extends Animal {

    private int runForce = 20;  // C каждым годом начиная с 3-х лет сабака будет пробегать на 20 м меньше
    private double jumpForce = 0.02; // Со соледующими параметрами также
    private double swimForce = 0.5;
    private int maxRun = 500;
    private double maxJump = 0.5;
    private int maxSwim = 10;

    Dog(String name) {
        super(name);
        setParams(runForce,
                jumpForce,
                swimForce,
                maxRun,
                maxJump,
                maxSwim);
    }
}
class Cat extends Animal{

    private double runForce=8;
    private double jumpForce=0.08;
    private int maxRun=200;
    private double maxJump=2;
    private double swimForce=0;
    private int maxSwim=0;

    Cat (String name){
        super(name);
        setParams(runForce,
                jumpForce,
                swimForce,
                maxRun,
                maxJump,
                maxSwim);
    }
}
