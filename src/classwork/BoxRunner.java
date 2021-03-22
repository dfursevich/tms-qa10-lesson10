package classwork;

import java.util.Random;

public class BoxRunner {
    public static void main(String[] args) {
        Box<String, String> box = new Box<>("item1", "item2");
        System.out.println(box.getItem());

        Box<Random, Integer> box2 = new Box<Random, Integer>(new Random(), 1);
        System.out.println(box2.getItem());
        System.out.println("box2.getItem2() = " + box2.getItem2());
    }
}
