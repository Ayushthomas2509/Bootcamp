package coffee;

import java.util.Scanner;

public class Cust {
    String order="";
    Scanner sc=new Scanner(System.in);
    public Cust(){
        System.out.println("Enter a coffee");
        order=sc.nextLine();
        payment();

    }


void payment(){

    Cashier.add(order);

}
static void ready(){
    System.out.println("Your Order is ready");
}
}
