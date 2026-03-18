package constructors;


public class Car {
    String brand;
    String color;
    int speed;

    public Car(){
        System.out.println("Constructor Called.");
    }

    public void drive(){
        System.out.println(brand + " is driving at " + speed);
    }
}
