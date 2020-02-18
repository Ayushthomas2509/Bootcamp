package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class q6 {
    q6(){
        List <Integer> l=new ArrayList<Integer>();
        int sum=0,sum2=0;
        int a[]={1,2,3,4,1,2,3,5,4};
        for (int i=0;i<a.length;i++)
        {
            if(l.contains(a[i])){
                sum2=sum2+a[i];
            }
            else {
                l.add(a[i]);
                sum=sum+a[i];
            }
        }
        System.out.println(sum-sum2);


    }
}
