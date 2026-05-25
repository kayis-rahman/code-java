package org.example;

public class MarkDetails {
    private int id;
    private Subject subject;
    private int mark;

    private char grade;

    public MarkDetails(Subject subject, int mark, char grade) {
        this.subject = subject;
        this.mark = mark;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "MarkDetails{" +
                "id=" + id +
                ", subject=" + subject +
                ", mark=" + mark +
                ", grade=" + grade +
                '}';
    }
}
