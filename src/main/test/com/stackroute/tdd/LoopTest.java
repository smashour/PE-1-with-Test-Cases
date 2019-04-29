package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopTest {
    Loop l;

    @Before
    public void setUp() throws Exception {
        l=new Loop();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void number() {
        assertEquals(0,l.number(0));
    }
}