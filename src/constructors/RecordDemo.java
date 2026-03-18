package constructors;

// records are the data holder
 record Bike(String brand, int Speed) {}
public class RecordDemo {
     public static void main() {
         Bike bike = new Bike("BMW",700);
         System.out.println("Brand: " + bike.brand());
         System.out.println("Speed: " + bike.Speed());
         System.out.println(bike);
     }

}
