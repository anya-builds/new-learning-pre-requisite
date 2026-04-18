package Pattern;

public class Main {
    public static void main(String[] args) {
//            int n=4;
            pattern1(4);
//        System.out.println(pattern1(n));
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
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
}
