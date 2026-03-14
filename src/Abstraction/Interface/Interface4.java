package Abstraction.Interface;

interface Chargeable{
    void charge();
    int getBatteryLevel();
}

interface GPSEnabled{
    void getLocation();
    void setDestination(String dest);
}

interface Connectable{
    void connectToBluetooth(String device);
    void connectToWifi(String network);
}

abstract class Phone{

    //Common state
    String brand;
    String model;
    int ram;
    int storage;

    Phone(String brand,String model,int ram,int storage){
      this.brand = brand;
      this.model = model;
      this.ram = ram;
      this.storage = storage;
    }

    void showInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
    }

    void callPerson(String number){
        System.out.println(model + " se " + number + " pe call kar raha hai...");
    }

    abstract void  takePicture();
    abstract void turnOn();
}

class Samsung extends Phone implements Chargeable,GPSEnabled,Connectable{
    int batteryLevel;

    public Samsung(String model, int ram, int storage) {
        super("Samsung", model, ram, storage);
        this.batteryLevel = 100;
    }

    @Override
    void takePicture() {
        System.out.println("Samsung camera: 200MP click");
    }

    @Override
    void turnOn() {
        System.out.println("OO GURU samsung boot ho rahaa hai... aur ye dekho guruh ye aaya GALAXY animation");
    }

    @Override
    public void charge() {
        System.out.println("Samsung 65W fast charging se charge ho raha hai");
        batteryLevel = 100;
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void getLocation() {
        System.out.println("Location: 28.6139° N, 77.2090° E (Delhi)");
    }

    @Override
    public void setDestination(String dest) {
        System.out.println("Navigation set: " + dest + " tak jao");
    }

    @Override
    public void connectToBluetooth(String device) {
        System.out.println(model + " connected to: " + device + " via Bluetooth");
    }

    @Override
    public void connectToWifi(String network) {
        System.out.println(model + " connected to wifi: " + network);
    }
}

class iPhone extends Phone implements Chargeable,GPSEnabled,Connectable{
    int batteryLevel;

    public iPhone( String model, int ram, int storage) {
        super("Apple", model, ram, storage);
        this.batteryLevel = 85;
    }

    @Override
    void takePicture() {
        System.out.println("iPhone camera: ProRAW capture with Photonic Engine");
    }

    @Override
    public void turnOn() {
        System.out.println("iPhone boot ho raha hai... Apple logo 🍎");
    }

    @Override
    public void charge() {
        System.out.println("iPhone MagSafe se charge ho raha hai 🔋");
        batteryLevel = 100;
    }



    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void getLocation() {
        System.out.println("Apple Maps location detect kar raha hai...");
    }

    @Override
    public void setDestination(String dest) {
        System.out.println("Siri: " + dest + " tak directions set kar diye 🗣️");
    }

    @Override
    public void connectToBluetooth(String device) {
        System.out.println(model + " AirDrop/Bluetooth connected: " + device);
    }

    @Override
    public void connectToWifi(String network) {
        System.out.println(model + " WiFi: " + network + " se connected hai");
    }

}
public class Interface4 {
    static void main(String[] args) {

    }
}
