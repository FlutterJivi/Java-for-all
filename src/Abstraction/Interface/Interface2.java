package Abstraction.Interface;

interface Vehicle{
    void start();
    void stop();

    //Default method - implementation hai interface mein hi
    //Subclass override kar sakti hai, KARNA ZARORI NAHI

    default void honk(){
        System.out.println("Beep Beep!");
    }

    default void fuelStatus(){
        System.out.println("Fuel status check kar raha hoon...");
    }

    static void trafficRules(){
        System.out.println("Signal pe rukna zaroori hai");
    }
}

class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car start: Vroom!");
    }

    @Override
    public void stop() {
        System.out.println("Car ruk gayi");
    }

    //honk() override nahi kiya bcz default wala chalega


    @Override
    public void fuelStatus() {
        System.out.println("Car mein full tank petrol hai");
    }
}

class ElectricCar implements Vehicle{
    @Override
    public void start() {
        System.out.println("Electric car start: Silent...");
    }

    @Override
    public void stop() {
        System.out.println("Electric car ruk gayi");
    }

    @Override
    public void honk() {
        System.out.println("Electric honk: Whoooosh");
    }

    @Override
    public void fuelStatus() {
        System.out.println("Battery 80% charged hai");
    }
}
public class Interface2 {
    static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.honk();
        car.fuelStatus();

        System.out.println("---");

        ElectricCar electricCar = new ElectricCar();
        electricCar.start();
        electricCar.honk();
        electricCar.fuelStatus();

        Vehicle.trafficRules();
    }
}
