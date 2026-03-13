package Abstraction;

abstract class Animal{
    String name;// normal variable allowed hai

    //Constructor allowed hai
    Animal(String name){
        this.name = name;
    }

    // abstract method koi body nhi hoti
    abstract void speak();

    //normal method bhi allowed hai iss ke andar likh bhi sakte ho
    void breathe(){
        System.out.println(name + " oxygen le raha hai");
    }
    void eat(){
        System.out.println(name + " khana kha raha hai");
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }

    @Override
    void speak() {
        System.out.println(name + " bolta hai: woof woof");
    }
}

class Cat extends Animal{
    Cat(String name){
        super(name);
    }

    @Override
    void speak(){
        System.out.println(name + " bolta hai: Meow Meow");
    }
}

class Snake extends Animal{
    Snake(String name){
        super(name);
    }

    @Override
    void speak() {
        System.out.println(name + " bolta hai: Sssss");
    }
}
public class Abstraction1 {
   public static void main(String[] args) {
       Dog dog = new Dog("Tommy");
       Cat cat = new Cat("Wiskers");
    }
}
