package classwork;

import java.util.HashSet;
import java.util.Set;

public class SetRunner {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("s1");
        set.add("s2");
        set.add("s3");
        System.out.println(set);
        set.add("s3");
        System.out.println(set);

        set.remove("s1");
        System.out.println(set);

        for (String s : set) {
            System.out.println(s);
        }


    }
}
