import java.io.IOError;

public class q2T extends Thread {

    public void run(){

        System.out.println("Running in Thread Class...");

    }

    public static void main(String[] args) throws InterruptedException {

        q2T q2 = new q2T();
        Thread t1 = new Thread(q2);
        t1.start();
        try {
            t1.sleep(400);
        } catch (Exception e) {
            System.out.println("Error");
        }

        q2I inter = new q2I();
        Thread t2 = new Thread(inter);
        t2.start();

    }

}

class q2I implements Runnable{

    public void run(){

        System.out.println("Running in Runnable ...");
    }
}
