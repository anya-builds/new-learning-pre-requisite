package Binary;

public class SearchInSorted {
    public static void main(String[] args) {
            int[][] matrix={

            };
    }
    static int[] binarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while (cStart<=cEnd){
         int mid=cStart+(cEnd-cStart)/1;
         if(matrix[row][mid]==target){
             return  new int[]{row,mid};
         }
         if(matrix[row][mid]<target){
                cStart=mid+1;
         }else{
             cStart=mid-1;
         }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(rows==1){
            return binarySearch(matrix,0,0,cols-1,target);

        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;
        //run the loop till tw rows are remaining
        while (rStart<(rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }
        //now we have two rows
        //check whether is in target is i the col of 2 rows
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }

        //search in first half
        //search in second half
        //search in third half
        //search in fourth half


    }
}
