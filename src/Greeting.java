import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//        greeting();
//        String personalized = myGreet("Ankita Arya");
//        System.out.println(personalized);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.next();
        String personalized = myGreet(name);
        System.out.println(personalized);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;

    }

    static void greet(){
        System.out.println("Hello world!");
    }
}
