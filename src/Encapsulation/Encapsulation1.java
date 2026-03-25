package Encapsulation;

class Student{
    public String name;
    public int age;
    public double marks;
    public String grade;
}

public class Encapsulation1 {
    static void main(String[] args) {
        Student s = new Student();

        s.name = "";
        s.age = -5;
        s.marks = 150;
        s.grade = "Z";

        System.out.println(s.age);
        System.out.println(s.marks);
    }
}
