import java.util.Scanner;

public class q5 implements Cloneable {
String name;
    q5(){
        System.out.println("Enter name ");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();

    }


    public static void main(String[] args) throws CloneNotSupportedException {
        q5 obj1=new q5();
        q5 obj2= (q5) obj1.clone();
        System.out.println("obj1 "+obj1.name);
        System.out.println("obj2 "+obj2.name);
    }

}


class CopyCon{
    String name;
    CopyCon(String s)
    {
        name=s;
    }
    CopyCon(CopyCon cc)
    {
      name=cc.name;
    }
    public static void main(String[] args)  {
        CopyCon c1=new CopyCon("Ayush");
        CopyCon c2=new CopyCon(c1);
        System.out.println("CopyCon1  "+c1.name);
        System.out.println("CopyCon2  "+c2.name);
    }
}
