public class q3 {
    q3(){
        try {
            Class c=Class.forName("nt");

        } catch (Exception e) {
            System.err.println(e.getMessage()+" Class not found");
        }
    }
}

