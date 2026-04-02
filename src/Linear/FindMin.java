package Linear;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        int ans=min(arr);
        System.out.println(ans);
    }
    static int min(int[] arr){
        int ans=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(ans>arr[i]){
                ans=arr[i];
            }

        }
        return ans;
    }
}
