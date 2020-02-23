import java.util.Scanner;


public class q3 extends Thread {
    @Override
    public synchronized void run() {
        for (int i=0;i<10;i++)
        {
            System.out.println("Hello "+i);
        }
    }

    public static void main(String[] args) {
        q3 q = new q3();
        Thread t1=new Thread(q);
        Thread t2=new Thread(q);

        t1.start();
        t2.start();
    }


}



class q3Block extends Thread {
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println( "JAVA " + i);
            }
        }
    }

    public static void main(String[] args) {
        q3Block t1 = new q3Block();
        q3Block t2 = new q3Block();

        t1.start();
        t2.start();
    }


}

