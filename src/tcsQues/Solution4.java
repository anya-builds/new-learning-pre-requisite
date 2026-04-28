package tcsQues;

import java.util.Arrays;
import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Inventory[] arr=new Inventory[4];
        for (int i = 0; i < arr.length; i++) {
            int a=sc.nextInt(); sc.nextLine();
            int b=sc.nextInt(); sc.nextLine();
            int c=sc.nextInt(); sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();

            arr[i]=new Inventory(a,b,c,d);


        }
        int limit=sc.nextInt();
        Inventory[] arr2=replenish(arr,limit);
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i].getThreshold()>75){
                System.out.println(arr[i].getInventoryId()+" Critical Filling");
            } else if (arr2[i].getThreshold()>=50 && arr2[i].getThreshold()<=75) {
                System.out.println(arr2[i].getInventoryId()+" Moderate Filling");
                
            }else{
                System.out.println(arr2[i].getInventoryId()+" Non Critical Filling");
            }

        }
    }
    public static Inventory[] replenish(Inventory[] arr,int limit){
        Inventory[] arr2=new Inventory[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getThreshold()<=limit){
                arr2= Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i];
            }
        }
        return arr2;
    }

}

class Inventory{
    int inventoryId;
    int maximumQuantity;
    int currentQuantity;
    int threshold;

    public Inventory(int inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public int getThreshold() {
        return threshold;
    }
}

