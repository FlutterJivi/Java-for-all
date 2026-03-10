package StaticInJava;

class A {

    static {
        System.out.println("A static block 1");
    }

    static {
        System.out.println("A static block 2");
    }

    A(){
        System.out.println("A constructor");
    }

}

class B extends A {

    static {
        System.out.println("B static block");
    }

    B(){
        System.out.println("B constructor");
    }

}

public class Tricky1 {

    public static void main(String[] args) {

        System.out.println("Main start");

        new B();

        System.out.println("Main end");
    }

}