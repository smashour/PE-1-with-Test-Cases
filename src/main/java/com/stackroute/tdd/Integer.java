package com.stackroute.tdd;

public class Integer {

    public int number(int n){
        if((n%2)==0 && (n>20)&&(n<30)) //to check even numbers between 20 and 30
        {
            System.out.println("Jerry");
        }
        else if((n%2)!=0&&(n>20)&&(n<30)) //to check odd numbers between 20 and 30
        {
            System.out.println("tom");
        }
        else {
            System.out.println("error");
        }
        return 0;
    }

}

