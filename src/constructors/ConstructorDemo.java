package constructors;

public class ConstructorDemo {
   public static void main(String[] args) {
        Car car1= new Car("Toyota",93,"orange");
//        car1.speed = 100;
//        car1.brand = "Tesla";
//        car1.color = "Red";
        car1.drive();

        Car car2 = new Car("Tesla",89,"red");
//        car2.brand= "Toyota";
//        car2.color = "Black";
//        car2.speed = 679;
        car2.drive();


       System.out.println(car2.getSpeed());
       car2.setSpeed(100);
       System.out.println(car2.getSpeed());

    }
}
