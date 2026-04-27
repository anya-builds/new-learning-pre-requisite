package tcsQues;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Phone[] arr=new Phone[4];
        for (int i = 0; i < arr.length; i++) {
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();

            arr[i]=new Phone(a,b,c,d);


        }
        String brand=sc.nextLine();
        String os=sc.nextLine();
        int sum=findPriceForGivenBrand(arr,brand);
        if(sum>0){
            System.out.println(sum);

        }else{
            System.out.println("the brand is not available");
        }
      Phone res2=  getPhoneIdBasedOnOs(arr,os);
        if(res2==null){
            System.out.println("No phone are available with os and price");
        }else{
            System.out.println(res2.getPhoneId());
        }
    }
    public static int findPriceForGivenBrand(Phone[] arr,String brand){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getBrand().equals(brand))
            {
                sum=sum+arr[i].getPrice();
            }
        }
        if(sum>0){
            return sum;
        }else{
            return 0;
        }

    }
    public static Phone getPhoneIdBasedOnOs(Phone[] arr,String os){
        Phone temp=null;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getOs().equals(os) && arr[i].getPrice()>50000){
                return arr[i];
            }

        }
        return temp;

    }

}

class Phone{
    int phoneId;
    String os;
    String brand;
    int price;

    public Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public String getOs() {
        return os;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}
