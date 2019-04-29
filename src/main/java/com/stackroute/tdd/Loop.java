package com.stackroute.tdd;

public class Loop {
    public int number(int n){

        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.printf("%d",i);
            }

        }
        if(n==0)
        {
            System.out.println("error");
        }
        return 0;
    }



    }
