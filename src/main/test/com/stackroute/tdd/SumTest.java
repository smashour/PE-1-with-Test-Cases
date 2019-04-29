package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {
    Sum num;
    @Before
    public void setUp() throws Exception {
        num=new Sum();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        assertEquals(null,num.add(-3,0));
    }
}