import model.Student;

public class Main {

    public static void main(String[] args) {
        Student stu = new Student("Alexander", 22, "Male", 410419093);
        System.out.println("Student name: " + stu.getName());
        System.out.println("Age: " + stu.getAge());
        System.out.println("Sex: " + stu.getSex());
        System.out.println("Student ID: " + stu.getStudentNumber());
    }
}