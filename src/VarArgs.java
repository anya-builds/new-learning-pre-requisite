import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(12,7,7,3,37);

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
