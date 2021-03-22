package good;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Good> goods = new ArrayList<>();

        Good t1 = new Good(1, "tea", 20);
        Good t2 = new Good(2, "coffee", 30);
        Good t3 = new Good(3, "milk", 40);

        goods.add(t1);
        goods.add(t2);
        goods.add(t3);

        System.out.println(goods);

        int id = 3;
        Good tx = new Good(id, null, null);

        int index = goods.indexOf(tx);
        System.out.println("index = " + index);
        System.out.println(goods.get(index));

        for (Good g : goods) {
            if (g.getId() == id) {
                System.out.println(g);
                g.setPrice(59);
            }
        }
    }
}
