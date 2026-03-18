package one.polymorphism;

public class polymorphismDemo {
    public static void main() {
       Car c1= new Car("Toyota",700,8);
       c1.displayInfo();

       Bike b1 = new Bike("Yamaha" , 120, true);
       b1.displayInfo();
       c1.start();
       b1.start();

       Vehicle v1 = new Vehicle("VehicleBrand",202);
       v1.start();

       // method overriding (Runtime Polymorphism)
       Vehicle v2 = new Car("Ford", 210, 6);
       v2.start();
    }
}
