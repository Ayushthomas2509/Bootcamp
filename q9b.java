package coffee;

import java.util.LinkedList;
import java.util.Queue;

public class Cashier {
    public static Queue<String> q = new LinkedList<>();
    static void add(String coffe){
        System.out.println("order Accepted");
        System.out.println("Order No "+q.size());
        q.add(coffe);
        Barista.prep();
    }
}
