public class ControlFlow {
    /*
    * what is control flow?
    * Control flow means how your program executes statements based on conditions or loops. Instead of running code line by line blindly. you can tell java.
    *
    * "do this if something is true.
    * "Repeat this until a conditions changes
    * "choose one path from many."
    *
    *
    * Java gives us main three types
    * 1. Decision making - > if, else if, else, switch
    * 2. loops (Iteration) -> for ,while, do-while, enhanced for each
    * 3. Jump statement-> break, continue.*/


    public static void main() {
        // if else
        int age = 14;
        if (age > 18){
            System.out.println("Welcome to our bank");
        } else{
            System.out.println("try again when you turn 18");
        }
    // if else ladder
        int marks=30;
        if (marks>90){
            System.out.println("A");

        }else if(marks>75){
            System.out.println("B");
        }else if(marks>60){
            System.out.println("C");
        }else{
            System.out.println("F");
        }

        //switch
        String day="tuesday";
        switch (day){
            case "Monday" -> System.out.println("start of the week");
            case "Friday" -> System.out.println("Last day of the week");
            default -> System.out.println("enjoy weekend");

        }
        //loops

//        for (int i=0;i<10 ;i++){
//            System.out.println(i);
//        }

        // while
        int num=0;
        while (num>0){
            System.out.println("Num: "+ num);
            num--;
        }

        // do-while
        int n=5;
        do{
            System.out.println("N: "+ n);
            n--;
        }while (n>0);

        //enhanced for loop
        String[] fruits = {"Apple","Banana","Guava","Mango"};
        for (String fruit:fruits){
            System.out.println("Fruits: "+ fruit);
        }

        for (int i=0;i< fruits.length;i++){
            System.out.println(fruits[i]);
        }

        //jump statement
        //break

        for(int i=0;i<10;i++){
            if(i==3) continue;
            if(i==7) break;
            System.out.println("Count: "+i);
        }
    }
}
