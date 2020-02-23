import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q8part2 {
    q8part2(){

        Scanner sc = new Scanner(System.in);
        String current="";
        List<String> l=new ArrayList<String>();
        do {
            current = sc.nextLine();
                l.add(current);




        } while (!l.get(l.size()-1).equals("done"));

        for (int i=0;i<l.size()-1;i++){
            int length=l.get(i).length();
            if(l.get(i).charAt(0)==l.get(i).charAt(length-1))
            {
                System.out.println("First and Last character of "+l.get(i)+" are same.");
            }
            else
            {
                System.out.println("First and Last character of "+l.get(i)+" are not same.");
            }
        }
