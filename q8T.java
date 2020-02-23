import java.util.Scanner;

import java.util.concurrent.Semaphore;

public class q8 extends Thread{
    Semaphore sem=new Semaphore(1);
    @Override
    public void run() {
        try {
            sem.acquire();
            System.out.println(Thread.currentThread()+" Lock Acquired");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        sem.release();
        System.out.println("Lock relased");
    }



    public static void main(String[] args) {
        q8 q=new q8();
        Thread t1=new Thread(q);
        Thread t2=new Thread(q);


        t1.start();
        t2.start();

    }
}
