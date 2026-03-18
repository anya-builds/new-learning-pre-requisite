package one.inheritance;

public class inheritanceDemo {
    public static void main() {
       Car c1= new Car("Toyota",700,8);
       c1.displayInfo();

       Bike b1 = new Bike("Yamaha" , 120, true);
       b1.displayInfo();
    }
}
