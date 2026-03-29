public class Scoping {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String name="Ankita";
        {
            a=100;
            System.out.println(a);
            int c=99;
            name="Rahul";
        }
        System.out.println(a);
    }
    static void random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
}
