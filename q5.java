package com.company;

public class q5 {
    q5(){

        int a[]={1,2,3,4,1,3};
        int b[]={4,5,6,2};
        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.println("common element "+a[i]);
                }
            }
        }
    }

}
