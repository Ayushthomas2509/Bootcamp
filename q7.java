import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class q7 {
    q7(){
        System.out.println("Enter Seconds ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int day = n / (24 * 3600);

        n = n % (24 * 3600);
        int hour = n / 3600;

        n %= 3600;
        int minutes = n / 60 ;

        n %= 60;
        int seconds = n;

        System.out.println( day + " " + "days " + hour + " " + "hours " + minutes + " " + "minutes " + seconds + " " + "seconds ");
    }
}
