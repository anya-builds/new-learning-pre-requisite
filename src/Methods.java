public class Methods {
    public static void main(String[] args) {


        sayHello("Ankita");
        sayHello("Manasvi");
        sayHello("Parul");

        System.out.println("Addition: " + add(29,80));
    }
    private static void sayHello(String name){
        System.out.println("Hello, " + name);
        System.out.println("Welcome to Skywards");
    }

    private static int add(int a,int b){
        return a+b;
    }
}
