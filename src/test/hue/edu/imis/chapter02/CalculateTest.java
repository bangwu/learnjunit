package test.hue.edu.imis.chapter02;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hue.edu.imis.chapter02.*;

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
        double result=calculate.add(1,1);
        Assert.assertEquals(2, result, 0);
    }
}
