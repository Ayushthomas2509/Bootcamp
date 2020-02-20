package com.company;
import java.sql.Array;
import java.util.Scanner;

public class dup {
    public static int count;

    public static void main(String[] Rollno) {
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String words[] = s.split(" ");
        int i;
        int j = 0;
        for ( i = 0; i < words.length; i++){
              count = 1;
        for ( j = 0; j < words.length; j++) {
            if (words[i].equals(words[j])) {
                count++;
            }
        }
        }
        words[j] = String.valueOf(0);
        if (count > 1 && words[i] != "0") {
            System.out.println(words[i]);
        }
    }
}
