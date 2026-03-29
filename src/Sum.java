import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans=sum2();
        System.out.println(ans);
    }
    static int sum2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.println("Enter number2: ");
        int num2=sc.nextInt();
        int sum2=num2+num1;
//        System.out.println("The sum= "+ sum);
        return sum2;
    }
    static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.println("Enter number2: ");
        int num2=sc.nextInt();
        int sum=num2+num1;
        System.out.println("The sum= "+ sum);
    }
}
