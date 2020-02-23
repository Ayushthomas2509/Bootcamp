
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class q1 {

      public static void main(String[] args) {
          ArrayList<Float> l=new ArrayList<Float>();
          float sum=0;
          for (int i=0;i<5;i++){
          l.add((float)i);
          }
          ListIterator<Float>i = l.listIterator();


          while (i.hasNext()) {
              sum=i.next();
          }
          System.out.println("sum "+sum);
      }
}
