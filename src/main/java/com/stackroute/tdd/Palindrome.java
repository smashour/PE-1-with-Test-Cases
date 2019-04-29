package com.stackroute.tdd;

public class Palindrome {

      int n,sum=0,reverse = 0;

    public int pal(int n) {

        int x, y;
        int num = n; //assigning number to another variable
        while (n != 0) {
            x = n % 10;
            reverse = reverse * 10 + x;
            n = n / 10;
        }
        if (reverse == num) {
            do {
                y = num % 10;
                if ((y % 2) == 0) //finding wheather digit is even or not
                {
                    sum = sum + y;
                }
                num = num / 10;
            } while (num != 0);



        if (sum < 25) {
            System.out.printf("%d is palindrome and sum of even numbers is less than 25 \n", reverse);
        } else {
            System.out.printf("%d is palindrome and the sum of even numbers is greater than 25\n", reverse);
        }
    }
        else

    {
        System.out.printf("%d not palindrome\n", reverse);
    }
        return sum;
    }
}
