package one.polymorphism;

public class Car extends Vehicle {
    private int doors;


    public void start(){
        System.out.println("Starting Car...");
    }
    public Car(String brand, int speed, int doors){
        super(brand,speed);
        this.doors=doors;
    }

    @Override
    public void displayInfo() {
//        super.displayInfo();
        System.out.println("Brand: " + getBrand() + ", Speed: " + getSpeed() + " km/hr" + doors + " doors");
    }
}
