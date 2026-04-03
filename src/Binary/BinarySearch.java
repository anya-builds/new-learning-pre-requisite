package Binary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,22,34,56};
        int ans=binarySearch(arr,-22);
        System.out.println(ans);
    }
    // return the index
    static int binarySearch(int[] arr,int target){
        // find the middle element
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid= start + (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;

            } else if (target>arr[mid]) {
                start=mid+1;

            }else {
                return mid;
            }
        }
        return -1;
    }
}
