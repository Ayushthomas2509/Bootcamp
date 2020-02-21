public class q1T extends Thread {
   volatile int i=0;

   public void run(){
       i++;

       System.out.println("The Value Is" + i);

   }

   public static void main(String[] args) throws InterruptedException {
       q1T q =new q1T();
       Thread t1 = new Thread(q);
       Thread t2 = new Thread(q);
       t2.start();
       t1.start();
   }
}

