import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q8 {
    q8(){

        Scanner sc = new Scanner(System.in);
        String  current = sc.nextLine();
        List<String> l=new ArrayList<String>();
        while (!current.equals("done")){
            l.add(current);
            current = sc.nextLine();


        }
               for (int i=0;i<l.size();i++){
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

            }
        }


