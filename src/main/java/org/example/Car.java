package org.example;

public class Car {
    // properties

    // -- Data Types
    // <DataTypes/WrapperClass> variable = "" / new Object;

    // -- Primitive -- mutable
    short aShort = 1; // x
    int intz = 1; // xx bit
    long aLong = 1l; // xxx bit

    char chars = 'a';

    float aFloat = 1.2f;
    double aDouble = 1.2d;
    boolean aBoolean = false;
    boolean ABoolean = false;
    boolean ABOOlean = false;

    //Arrays
    int[] intArray = {}; //
    int[] intArray2 = {1, 2, 3}; //
    int intArray3[] = {1, 2, 3}; //
    Integer intArray4[] = new Integer[3]; //


    ///  Constructor
    public Car() {
        intArray4[0] = 1;
        intArray4[1] = 2;
        intArray4[2] = 3;
    }

     int sum(int ab0, int ab1, int ab2 ){
        System.out.println("..........drive()..........");

        return ab0 + ab1 + ab2;
    }


    byte aByte = 12; // 12

    // -- Non-Primitive (Wrapper class) -- immutable
    Integer integer = 1; //new Integer(1);
    Number number = 1;
    String string = "I am string"; //new String();
    // boolean
    // single
    // double
    // long
    // short
    // byte

    private String color = "Red";
    private String brand = "Benz";
    private int noOfWheels = 4;
    private char classZ= 'A';

    // behaviors
    // Drive
    // <access modifier - default, private, protected > returnType methodName(Params.... )
    private void drive(){
        System.out.println("..........drive()..........");
    }

    public void publicDrive(){
        System.out.println("..........publicDrive()..........");
        drive();
    }

    static void main() {
        System.out.println("..........Car Main..........");

        Car car = new Car();
        car.drive();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public char getClassZ() {
        return classZ;
    }

    public void setClassZ(char classZ) {
        this.classZ = classZ;
    }
}
