package org.example;

import java.util.Arrays;

public class Classz {
     private int id;
     private String name;
     private char div;
     private Subject[] subject;

     public Classz(String name, char div, Subject[] subject) {
          this.name = name;
          this.div = div;
          this.subject = subject;
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

     public char getDiv() {
          return div;
     }

     public void setDiv(char div) {
          this.div = div;
     }

     public Subject[] getSubject() {
          return subject;
     }

     public void setSubject(Subject[] subject) {
          this.subject = subject;
     }

     @Override
     public String toString() {
          return "Classz{" +
                  "id=" + id +
                  ", name='" + name + '\'' +
                  ", div=" + div +
                  ", subject=" + Arrays.toString(subject) +
                  '}';
     }
}
