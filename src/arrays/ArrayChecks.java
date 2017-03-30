package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayChecks {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() {
            {
                add("One");
                add("Two");
            }
        };

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
