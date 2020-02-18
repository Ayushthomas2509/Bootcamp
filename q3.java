package com.company;
import java.util.Scanner;


public class q3 {
    public q3() {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in) ;
        String s = sc.nextLine();
        System.out.println("Char to count");
        String w = sc.nextLine();

        System.out.println(s.length()-(s.replace(w,"").length()));
    }
}