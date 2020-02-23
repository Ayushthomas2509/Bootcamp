import java.util.concurrent.*;

public class q7 implements Callable {

    public String call() throws Exception
    {
       String s="Ayush";


        return s;
    }

}

class CallableFuture
{
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> f = executor.submit(new q7());
        executor.shutdown();

        System.out.println(f.get());
    }

    }
