package Abstraction.Interface;
interface  Flyable{
    int MAX_HEIGHT = 10000;// YE automatic public static final int MAX_HEIGHT HO JAYEGA

    void fly();
    void land();
    int getSpeed();
}

interface Swimmable{
    void swim();
    void dive();
    int getDepth();
}

interface Runnable{
    void run();
    int getRunSpeed();
}

class Eagle implements Flyable{
    @Override
    public void fly() {
        System.out.println("Eagle fly kar raha hai");
    }

    @Override
    public void land() {
        System.out.println("Eagle land kar raha hai");
    }

    @Override
    public int getSpeed() {
        return 150;
    }
}

class Fish implements Swimmable{
    @Override
    public void swim() {
        System.out.println("fish paani mai tez swim kar rahi hai");
    }

    @Override
    public void dive() {
        System.out.println("Fish gehraai mein gayi");
    }

    @Override
    public int getDepth() {
        return 200;
    }
}

class Duck implements Flyable,Swimmable,Runnable{
    @Override
    public void fly() {
        System.out.println("Guru mujhee duckh thodaa udte hue dikh raha hai");
    }

    @Override
    public void land() {
        System.out.println("WO DEKHO guru duckh land kar raha hai");
    }

    @Override
    public int getSpeed() {
        return 50;
    }

    @Override
    public void swim() {
        System.out.println("Duck paani mein swin kar raha hai");
    }

    @Override
    public void dive() {
        System.out.println("Duck thoda dive kar raha hai");
    }

    @Override
    public int getDepth() {
        return 5;
    }

    @Override
    public void run() {
        System.out.println("wo dekho guru duckh waddle waddle kar ke ruun kar raha hai");
    }

    @Override
    public int getRunSpeed() {
        return 10;
    }
}
public class Interface1 {
    static void main(String[] args) {
        Duck duck = new Duck();

        Flyable flyable = new Duck();
        Flyable flyable1 = duck;

        Swimmable swimmable = duck;
        Runnable runnable = duck;

        flyable.fly();
        flyable1.fly();
        swimmable.swim();
        swimmable.dive();
        runnable.run();

        System.out.println("Max height: " + flyable1.MAX_HEIGHT);
    }
}
