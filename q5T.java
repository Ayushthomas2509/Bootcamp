public class q5 {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();

        synchronized(b){
            System.out.println("before wait");
            b.wait();
            System.out.println("after wait");
        }
    }
}

class ThreadB extends Thread{
    int total;
    @Override
    public void run(){
        synchronized(this){

            System.out.println("About to notify" );
            notify();
            System.out.println("After Notify");
        }
    }
}
