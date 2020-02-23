import java.util.Scanner;

class process extends Thread {
    public volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello"
            );
            try {
                Thread.sleep(400);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public void Shutdown(){
        running = false;
    }
}





public class prac2 {

    public static void main(String[] args) {
        process p1 = new process();
        p1.start();

        System.out.println("Enter Key");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        p1.Shutdown();
    }
}




