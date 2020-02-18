package com.company;

import java.util.Scanner;

public class q4 {
    q4(){
     System.out.println("Enter a String");
    Scanner sc = new Scanner(System.in) ;
    String s = sc.nextLine();
    int total = s.length(),upper = 0,lower= 0,no = 0,sp = 0;


        for (int i = 0; i < s.length(); i++)
    {
        char ch = s.charAt(i);

        if(Character.isUpperCase(ch))
        {
            upper++;
        }

        else if(Character.isLowerCase(ch))
        {
            lower++;
        }

        else if (Character.isDigit(ch))
        {
            no++;
        }

        else
        {
            sp++;
        }
    }
        System.out.println("Upper:"+(upper * 100.0) / total);
        System.out.println("Lower:"+(lower * 100.0) / total);
        System.out.println("Numbers:"+(no * 100.0) / total);
        System.out.println("Special:"+(sp * 100.0) / total);

}
}