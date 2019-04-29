package com.stackroute.tdd;

public class Sum {

    int sum = 0, n;
    public int add(int n){


        while((n=0)){
        if(n>0)
        {
            sum = sum + n;
        }

        else
        {
            System.out.println("error");
        }
    }
        System.out.printf("%d", sum);

        return sum;
    }


}
