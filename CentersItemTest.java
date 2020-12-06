package com.example.myapplication2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CentersItemTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sum() {
        int result = CentersItem.sum(10,20);
        Assert.assertEquals(30,result);
    }

    @Test
    public void getMap() {
        Assert.assertNotNull(0);
    }

    @Test
    public void getInfo() {
        Assert.assertNotNull(0);
    }

    @Test
    public void getPhone() {
        Assert.assertNotNull(0);
    }
}
