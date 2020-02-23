import javafx.concurrent.Task;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class q4 {

    static class even implements Runnable{


        @Override
        public void run() {
            for (int i = 0; i < 10; i = i + 2) {
                System.out.println(i);
            }
        }
    }
   static class odd implements Runnable{


        @Override
        public void run() {
            for (int i = 1; i < 10; i = i + 2) {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        ExecutorService pool= Executors.newFixedThreadPool(2);
        Runnable evenR=new even();
        pool.execute(evenR);
        Runnable oddR=new odd();
        pool.execute(oddR);
        pool.shutdown();

    }
}
