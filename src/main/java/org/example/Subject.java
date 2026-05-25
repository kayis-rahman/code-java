package org.example;

public class Subject {
     private int id;
     private String name;
     private String type; // (theory/practical)

     public Subject(String name, String type) {
          this.id = 1;
          this.name = name;
          this.type = type;
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

     public String getType() {
          return type;
     }

     public void setType(String type) {
          this.type = type;
     }

     @Override
     public String toString() {
          return "Subject{" +
                  "id=" + id +
                  ", name='" + name + '\'' +
                  ", type='" + type + '\'' +
                  '}';
     }
}

