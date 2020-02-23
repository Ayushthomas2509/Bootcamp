import java.util.concurrent.CountDownLatch;

public class q9 extends Thread {
    CountDownLatch latch;
q9(CountDownLatch latch){
this.latch=latch;
}

    @Override
    public void run() {

        System.out.println(Thread.currentThread());
        latch.countDown();
    }
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch=new CountDownLatch(2);
        q9 q=new q9(latch);
        Thread t1=new Thread(q);
        Thread t2=new Thread(q);
        t1.start();
        t2.start();
        latch.await();
    }
}
