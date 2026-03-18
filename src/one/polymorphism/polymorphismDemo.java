package one.polymorphism;


class Calculator {
    public int add(int a,int b){
        return a+b;
    }

    public double add(double a,double b){
        return a+b;
    }
}
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

       Vehicle v3 = new Bike("Yamaha" , 120, true);
       v3.start();

       //method overloading
       b1.start("Hello");
       Calculator cal = new Calculator();
        System.out.println("SUM(int): " + cal.add(6,7));
        System.out.println("SUM(int): " + cal.add(6.8,7.9));
    }
}
