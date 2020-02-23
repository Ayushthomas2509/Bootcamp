import java.util.Scanner;

public class q13 {
    q13(){

        try
        {

                throw new MyExcp();

        }
        catch(MyExcp e)
        {
            System.err.println("My Error Catch");

        }
    }
}
