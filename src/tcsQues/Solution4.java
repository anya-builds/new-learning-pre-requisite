package tcsQues;

import java.util.Scanner;

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
    }
    public static
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

