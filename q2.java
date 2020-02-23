import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    q2(){
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String str = sc.next();

        char[] arr = str.toCharArray();

        Arrays.sort(arr);
        System.out.println(arr);
    }
}
