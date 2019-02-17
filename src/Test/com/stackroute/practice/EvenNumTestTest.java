package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest even;
    @Before
    public void setUp() throws Exception {
       even= new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
        even = null;
    }

    @Test
    public void even() {
        boolean expectedValue =true;
        boolean actualValue = even.isEven(2);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void evenin() {
        boolean expectedValue = false;
        boolean actualValue = even.isEven(3);
        assertNotNull(actualValue);
    }

}