package com.company;

import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

import java.lang.reflect.Array;
import java.util.Arrays;


public class q2 {
    public q2() {
        System.out.println("Enter a String");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String words[]=s.split(" ");

int[] wordcount=new int[words.length];
        Arrays.fill(wordcount,1);

    for (int i=0;i<words.length;i++)
{
for (int j=i+1;j<words.length;j++){
    if(words[i].equals(words[j])&&words[i]!="0")
    {
        wordcount[i]++;
        words[j]="0";
    }
}

}
        String orignal[]=s.split(" ");

for (int i=0;i<wordcount.length;i++){
    if(wordcount[i]>1)
    {
        System.out.println(orignal[i]+"="+wordcount[i]);
    }
}

    }
}
