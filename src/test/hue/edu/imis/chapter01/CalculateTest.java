package test.hue.edu.imis.chapter01;

import hue.edu.imis.chapter01.Calculate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wubang on 14/11/14.
 */
public class CalculateTest {
    private Calculate calculate;

    @Before
    public void init(){
        calculate=new Calculate();
    }

    @Test
    public void testAdd(){
        Assert.assertEquals(3,calculate.add(1,2),0);
    }
}
