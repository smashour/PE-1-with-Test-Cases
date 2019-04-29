package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome p;
    @Before
    public void setUp() throws Exception {
        p=new Palindrome();
    }

    @After
    public void tearDown() throws Exception {

p=null;
    }

    @Test
    public void shouldRecognizePalindrome() {

        assertEquals(4, p.pal(1221));
    }

    @Test
    public void shouldRecognizeNonPalindrome() {

        assertEquals(0, p.pal(1234));
    }

    @Test
    public void shouldRecognizenPalindromeWithOdd(){

        assertEquals(0,p.pal(333));
    }
    @Test
    public void shouldRecognizeOneDigitPalindrome(){

        assertEquals(4, p.pal(4));
    }
    @Test
    public void shouldRecognizeSumGreaterThan25(){

        assertEquals(32, p.pal(8888));

    }

}