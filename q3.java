import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Map<Character,Integer> m=new HashMap<Character,Integer>();
        System.out.println("Enter a string ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ca=s.toCharArray();
        for(int i=0;i<s.length();i++){

           if(m.containsKey(ca[i])){
               m.put(ca[i],m.get(ca[i])+1);
           }
           else {
               m.put(ca[i],1);
           }
        }
        for(Map.Entry entry : m.entrySet()){
            System.out.println(entry.getValue()+" "+entry.getKey());
        }


    }
}
