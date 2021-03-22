package classwork;

import java.util.*;

public class ListRunner {
    public static void main(String[] args) {
        List<String> l1 = new LinkedList<>();
        l1.add("s1");
        l1.add("s2");
        l1.add("s3");
        System.out.println(l1);

        l1.add("s3");
        System.out.println(l1);

        l1.add(0, "s0");
        System.out.println(l1);

        l1.set(0, "s00");
        System.out.println(l1);

        l1.remove(0);
        System.out.println(l1);

        l1.remove("s2");
        System.out.println(l1);

        List<String> subList = new ArrayList<>();
        subList.add("sub1");
        subList.add("sub2");

        l1.addAll(subList);
        System.out.println(l1);

        System.out.println("l1.get(0) = " + l1.get(0));

        System.out.println("l1.contains(\"s3\") = " + l1.contains("s3"));
        System.out.println("l1.contains(\"s4\") = " + l1.contains("s4"));

        for (Iterator<String> it = l1.iterator(); it.hasNext(); ) {
            String el = it.next();
            System.out.println("el = " + el);
        }

        for (String el : l1) {
            System.out.println("el = " + el);
        }
    }
}
