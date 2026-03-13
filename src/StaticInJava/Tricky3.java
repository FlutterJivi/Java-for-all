package StaticInJava;
class A2{
    static int count = 0;

    A2(){
        count++;
        System.out.println("A Constructor: " + count);
    }

    static void show(){
        System.out.println("A static: " + count);
    }
}

class B2 extends A2{
    static int count = 10;

    B2(){
        count++;
        System.out.println("B Constructor: " + count);
    }

    static void show(){
        System.out.println("B static: " + count);
    }
}


public class Tricky3 {
    static void main() {
        A2 obj1 = new B2();
        A2 obj2 = new B2();

        obj1.show(); // static 2
        obj2.show(); // static 2

        B2 obj3 = new B2();
        obj3.show();

        System.out.println(A2.count);//3
        System.out.println(B2.count);//13
    }
}
