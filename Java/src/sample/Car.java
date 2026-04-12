package sample;

public class Car {
    // 1. fields
    String brand;
    int year;

    // 2. Constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // 3. Method
    public void displayInfo(String string) {
        System.out.println(string);
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    // Main     
     public static void main(String[] args) {
        // Create an Object
        Car myCar = new Car("Toyota", 2024);
        
        // call method
        myCar.displayInfo("this is my car");
    }
}
