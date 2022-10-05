package oop;

public class Student {

    private String name;
    private int age;
    private int semesterNo;
    private double gpa;

    public Student(String name, int age, int semesterNo, double gpa) {
        this.name = name;
        this.age = age;
        this.semesterNo = semesterNo;
        this.gpa = gpa;
    }

    public Student() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSemesterNo() {
        return semesterNo;
    }

    public void setSemesterNo(int semesterNo) {
        this.semesterNo = semesterNo;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
