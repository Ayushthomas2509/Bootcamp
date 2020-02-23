package coffee;

import java.util.LinkedList;
import java.util.Queue;

public class Barista {
    static boolean ready=false;

   public static boolean prep(){

       System.out.println("Order in preparation");
       ready=true;
        done();
    return ready;
}

static void done(){
Cashier.q.remove();
Cust.ready();
}

}
