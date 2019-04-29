package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerTest {

    Integer exist;

    @Before
    public void setUp() throws Exception {
        exist=new Integer();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void oddNumber() {
       assertSame(0,exist.number(23));
    }

    @Test
    public void evenNumber() {
        assertSame(0,exist.number(26));
    }

    @Test
    public void evenNumberGreaterThan30() {
        assertSame(0,exist.number(32));
    }
    @Test
    public void evenNumberLesserThan20() {
        assertSame(0,exist.number(18));
    }
    @Test
    public void oddNumberGreaterThan30() {
        assertSame(0,exist.number(33));
    }
    @Test
    public void oddNumberLesserThan20() {
        assertSame(0,exist.number(13));
    }
    @Test
    public void number30() {
        assertSame(0,exist.number(30));
    }
    @Test
    public void number20() {
        assertSame(0,exist.number(20));
    }
}