package Encapsulation;

class Student1 {
    private String name;
    private int age;
    private double marks;
    private String grade;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarks(double marks) {
        this.marks = marks;
        calculateGrade();
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    private void calculateGrade() {
        if (marks >= 90) grade = "A+";
        else if (marks >= 80) grade = "A";
        else if (marks >= 70) grade = "B";
        else if (marks >= 60) grade = "C";
        else grade = "F";
    }
}

public class Encapsulation2 {
    static void main(String[] args) {
        Student1 student1 = new Student1();

        student1.setName("");
        System.out.println(student1.getName());

    }
}
