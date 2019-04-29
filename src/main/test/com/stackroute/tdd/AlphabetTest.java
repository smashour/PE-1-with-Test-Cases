package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabetTest {
    Alphabet word;
    @Before
    public void setUp() throws Exception {
        word=new Alphabet();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void letters() {
        assertSame(0,word.letter("ab"));
    }

    @Test
    public void vowel() {
        assertSame(0,word.letter("u"));
    }

    @Test
    public void consonant() {
        assertSame(0,word.letter("b"));
    }


    @Test
    public void numbers() {
        assertSame(0,word.letter("8"));
    }
}