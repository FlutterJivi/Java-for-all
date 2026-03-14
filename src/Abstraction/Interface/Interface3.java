package Abstraction.Interface;

interface Printable{
    void print();
}

interface Scannable{
    void scan();
}

interface MultiFunctionDevice extends Printable,Scannable{
    void fax();
    void copy();
}

//Class ko saare methods implement karne padenge
// Printable ke bhi,Scannable ke bhi,MultiFunctionDevice ke bhi
class OfficePrinter implements MultiFunctionDevice{
    @Override
    public void print() {
        System.out.println("Document print ho raha hai");
    }

    @Override
    public void scan() {
        System.out.println("Document scan ho raha hai");
    }

    @Override
    public void fax() {
        System.out.println("Fax bheja ja raha hai 📠");
    }

    @Override
    public void copy() {
        System.out.println("Document copy ho raha hai 📋");
    }
}

public class Interface3 {
    static void main(String[] args) {

    }
}
