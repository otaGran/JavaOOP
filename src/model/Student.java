package model;


public class Student {
    private String name;
    private int studentNumber;
    private int age;
    private String sex;
    public Student(String name, int age, String sex, int studentNumber) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.studentNumber = studentNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}