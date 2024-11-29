class Vehicle{
    String brand;
    int year;

    void startEngine(){
        System.out.println("Engin Off");
    }
}

class Car extends Vehicle{
    String fuelType;
    void startEngine(){
        System.out.println("Car Engine Started");
    }

    void drive(){
        System.out.println("Car is driving");
    }
}

class Truck extends Vehicle{
    int loadCapacity;
    void startEngine(){
        System.out.println("Truck Engine Started");
    }

    void haul(){
        System.out.println("Truck is hauling");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.brand = "Benz");
        System.out.println(car.year = 2024);
        System.out.println(car.fuelType = "Petrol");
        car.startEngine();
        car.drive();

        System.out.println();
        Truck truck = new Truck();
        System.out.println(truck.brand = "Ford");
        System.out.println(truck.year = 2025);
        System.out.println(truck.loadCapacity = 1000);
        truck.startEngine();
        truck.haul();

    }
}
