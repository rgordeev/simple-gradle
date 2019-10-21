package ru.rgordeev;

import org.junit.Assert;
import org.junit.Test;

public class LauncherTest {

    @Test
    public void testSum() {
        Integer a = 1;
        Integer b = 2;
        Assert.assertEquals(Integer.valueOf(3), Launcher.sum(a, b));
    }
}
