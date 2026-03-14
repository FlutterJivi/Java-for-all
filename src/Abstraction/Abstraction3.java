package Abstraction;
/*
rule 1 -> abstract class ka object nhi banata
rule 2 -> abstract class mein abstract method ho bhi sakta hai nahi bhi.
rule 3 -> agar class mein ek bhi abstract method hai toh pura class abstract karna padega
rule 4 -> Subclass ko sare abstract methods implement karne padte hain agar ek chose nhi kiya toh error dega
rule 5 -> Abstract class mai Constructor ho sakta hai wo baat alag hai ki hum object nhi bana sakte par super() se call ho jata hai
rule 6 -> abstract class mein static methods ho sakte hai
rule 7 -> Abstract methods mein instance variables ho sakte hain

*/
abstract class Animal1 {
    abstract void eat();
    abstract void sleep();
}

class Animal2 extends Animal1{
    void eat(){

    }

    @Override
    void sleep() {

    }
}
public class Abstraction3 {
    public static void main(String[] args) {

    }
}
