package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("----- MAIN -----");


        // Object of Car
        Car car = new Car();
        car.publicDrive();

        System.out.println("car.sum() = " + car.sum(1, 2, 3));


        System.out.println("------------ Show Properties -----------");
        System.out.println(car.getColor());
        System.out.println(car.getBrand());
        System.out.println(car.getClassZ());
        System.out.println(car.getNoOfWheels());


        System.out.println("------------ Update Properties -----------");
        car.setBrand("Tesla");
        car.setColor("Green");
        car.setClassZ('X');
        car.setNoOfWheels(5);

        System.out.println(car.getColor());
        System.out.println(car.getBrand());
        System.out.println(car.getClassZ());
        System.out.println(car.getNoOfWheels());

    }
}
