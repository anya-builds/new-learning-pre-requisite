import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(12,7,7,3,37);

        multiple(12,34,"Ankita","Gagan");
    }
    static void multiple(int a,int b,String ...v){
//        System.out.println(Arrays.toString(a,b,v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
