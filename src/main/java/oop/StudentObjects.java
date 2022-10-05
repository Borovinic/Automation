package oop;

public class StudentObjects extends Student {
    public StudentObjects(String name, int age, int semesterNo, double gpa){
        super (name, age, semesterNo, gpa);
    }

    public static void main(String[] args) {
        Student [] students = new Student[3];
        students [0]  = new Student("Sonja", 33, 6, 9.6);
        students [1] = new Student("Ana", 22, 2, 9.3);
        students [2] = new Student("Zoja", 23, 1, 9.1);

        System.out.println(students[0].getName() + " " + students[0].getAge() + " " + students [0].getName() + " " + students[0].getGpa());
        System.out.println(students[1].getName() + " " + students[1].getAge() + " " + students[1].getSemesterNo() + " " + students[1].getGpa());
        System.out.println(students[2].getName() + " " + students[2].getAge() + " " + students[2].getSemesterNo() + " " + students[2].getGpa());

 double gpaAverage = (students[0].getGpa() + students[1].getGpa() + students[2].getGpa() / 3);
        System.out.println("Average GPA of the three Students: " + gpaAverage);

    }
}
