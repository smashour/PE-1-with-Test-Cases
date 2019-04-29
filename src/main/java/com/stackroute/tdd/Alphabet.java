package com.stackroute.tdd;

public class Alphabet {
    public int letter(String str) {

        for (int i = 0; i < str.length(); i++) //passing through characters
        {
            char c = str.charAt(i);
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                System.out.print("vowel ");

            } else if (Character.isDigit(c))  //to check for digits
            {
                System.out.print("error ");
                System.out.println(" ");
            }

            else {
                System.out.print("consonant "); //checking for consonants
                System.out.println(" ");
            }
        }
        return 0;
    }
}
