package org.example;

import java.util.Arrays;
import java.util.List;

public class Marksheet {
    private int id;
    private Student student;
    private List<MarkDetails> markDetails;

    public Marksheet(List<MarkDetails> markDetails, Student student) {
        this.markDetails = markDetails;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<MarkDetails> getMarkDetails() {
        return markDetails;
    }

    public void setMarkDetails(List<MarkDetails> markDetails) {
        this.markDetails = markDetails;
    }

    @Override
    public String toString() {
        return "Marksheet{" +
                "id=" + id +
                ", student=" + student +
                ", markDetails=" + markDetails.toString() +
                '}';
    }
}
