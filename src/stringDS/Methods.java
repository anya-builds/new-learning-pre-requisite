package stringDS;

import java.util.Arrays;

public class Methods {
    public static void main() {
        String name="Ankita Arya";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("  Ankita  ".strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
