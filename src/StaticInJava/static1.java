package StaticInJava;
class Dog{
    String name;// instance variable
    int age;

    static int totalDogs = 0; // static variable

    Dog(String name,int age){
        this.name=name;
        this.age=age;
        totalDogs++;
    }

}
public class static1 {
    public static void main() {
        Dog d1 = new Dog("David",18);
        Dog d2 = new Dog("John",19);
        Dog d3 = new Dog("John",19);
        System.out.println(Dog.totalDogs);
        System.out.println(d1.totalDogs);

        Dog d = new Dog("Tommy",3);
        Class<?> c2 = d.getClass();
        System.out.println(c2);


    }
}
