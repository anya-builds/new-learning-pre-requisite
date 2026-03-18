package constructors;

public class ConstructorDemo {
   public static void main(String[] args) {
        Car car1= new Car("Toyota","yellow",673);
//        car1.speed = 100;
//        car1.brand = "Tesla";
//        car1.color = "Red";
        car1.drive();

        Car car2 = new Car("Tesla","red",89);
//        car2.brand= "Toyota";
//        car2.color = "Black";
//        car2.speed = 679;
        car2.drive();

    }
}
