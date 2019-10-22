package ru.rgordeev;

import org.junit.Assert;
import org.junit.Test;

public class LauncherTest {

    @Test
    public void testSum() {
        Integer a = 12345;
        Assert.assertEquals(Integer.valueOf(15), Launcher.sum(a));
    }

    @Test
    public void testNextEven() {
        Integer a = 2;
        Assert.assertEquals(Integer.valueOf(4), Launcher.nextEven(a));
    }

    @Test
    public void testPrintPrice() {
        Integer a = 2;
        Integer b = 50;
        Integer n = 2;
        Assert.assertEquals("5 0", Launcher.printPrice(a, b, n));
    }
}
