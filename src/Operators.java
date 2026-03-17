public class Operators {
    public static void main(String[] args) {
        //operators
//        System.out.println((10+20)*2);
        arithmeticOperator();
        unaryDemo();
        logicalDemo();
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


private static void logicalDemo(){
    System.out.println("\n ----logical operators ---");
    boolean isAdult  = true;
    boolean hasTicket = false;
    if(isAdult || hasTicket){
        System.out.println("Welcome");

    }else{
        System.out.println("Bye");
    }

    if((4>10) || (5<10)){
        System.out.println("Hello");
    }

    //ternary operator
    System.out.println((isAdult || hasTicket) ? "Welcome" : "Bye");


}
}
