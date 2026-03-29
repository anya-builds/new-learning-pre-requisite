import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans=sum2();
        int ans=sum3(12,34);
        System.out.println(ans);
    }
    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
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
