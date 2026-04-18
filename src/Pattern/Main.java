package Pattern;

public class Main {
    public static void main(String[] args) {
//            int n=4;
            pattern5(5);
//        System.out.println(pattern1(n));
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row--) {
            //for every row run the col
            for (int Col = 1; Col <= row; Col++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
    static void pattern1(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = 1; row<=n ; row++) {
            for (int col =1; col <=n-row+1; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    static void pattern4(int n){
        for (int row = 1 ; row <=n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");

            }
            System.out.println();

        }
    }
    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow= row>n?2*n-row-1:row;
            for (int col = 0; col <= totalColsInRow; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
