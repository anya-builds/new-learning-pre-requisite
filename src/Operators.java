public class Operators {
    public static void main(String[] args) {
        //operators
//        System.out.println((10+20)*2);
        arithmeticOperator();
        unaryDemo();
    }

    private static void arithmeticOperator() {
        System.out.println("\n ---- Arithmetic operators----");
        int a=10, b=3;
        System.out.println("a+b= " +(a+b));
        System.out.println("a-b= " +(a-b));
        System.out.println("a*b= " +(a*b));
        System.out.println("a/b= " +(a/b));
        System.out.println("a%b= " +(a%b));
    }
private static void unaryDemo(){
    System.out.println("\n ---- Unary operators---");
    int x=5;
    System.out.println("++x= " + (++x) );
    System.out.println("x++= " + (x++) );
    System.out.println("x after post increment= " + x );
    System.out.println("-x= " + (-x) );
}
}
