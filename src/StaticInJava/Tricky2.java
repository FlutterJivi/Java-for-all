package StaticInJava;
class A1 {
    static {
        System.out.println("A1 static block");
        B1 b = new B1();
    }
}

class B1 {
    static {
        System.out.println("B1 static block");
        A1 a = new A1();
    }
}
public class Tricky2 {
    static void main(String[] args) {
        new A1();
    }
}
