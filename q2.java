import java.util.*;

public class q2 {
    public static void main(String[] args) {
        System.out.println("Enter a string ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Set<Character> l=new HashSet<Character>();
     for (int i=0;i<s.length();i++){
        l.add(s.charAt(i));
     }
        System.out.println(l.size());
     System.out.println(l);
    }
}
