package constructors;


public class Car {
    String brand;
    String color;
    private int speed;

    public Car(String brand, int speed, String color) {
        this.brand = brand;
        this.speed = speed;
        this.color = color;
    }

    //    public Car(String brand,String color,int speed){
//        System.out.println("Constructor Called.");
//        this.brand = brand;
//        this.color = color;
//        this.speed = speed;
//    }

    public void drive(){
        System.out.println(brand + " is driving at " + speed);
    }

    public int getSpeed() {
        if(speed<0)
            return 0;
        return speed;
    }
    public void setSpeed(int speed){
        this.speed=  speed;
    }
}
