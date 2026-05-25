package org.example;

public class Student {
    private int id;
    private String name;
    private Classz classz; // default/public/private/protected

    public Student() {
        this.id = 1;
    }
    public Student(String name, Classz classz) {
        this.name = name;
        this.classz = classz;
        this.id = 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classz=" + classz +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classz getClassz() {
        return classz;
    }

    public void setClassz(Classz classz) {
        this.classz = classz;
    }
}
