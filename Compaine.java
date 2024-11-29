abstract class vehicle{
    final void startEngine(){
        System.out.println("Engine started");
    }

    static String getVehicleType(){
        return "Generic Vehicle";
    }

    abstract void drive();
}


class Car extends vehicle{
    void drive(){
        System.out.println("Car Drive");
    }

}


class MotorCycle extends vehicle{
    void drive(){
        System.out.println("Bike Drive");
    }
}

public class Compaine {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.startEngine();
        car1.drive();
        System.out.println(car1.getVehicleType());

        System.out.println();

        MotorCycle motorCycle1 = new MotorCycle();
        motorCycle1.startEngine();
        motorCycle1.drive();
        System.out.println(motorCycle1.getVehicleType());
    }
}
