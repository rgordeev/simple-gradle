package ru.rgordeev;

import org.junit.Assert;
import org.junit.Test;

public class LauncherTest {

    @Test
    public void testSum() {
        Integer a = 12345;
        Assert.assertEquals(Integer.valueOf(15), Launcher.sum(a));
    }
}
