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
        new Calculate();

    }

    @Test(timeout =0)
    public void testAdd(){
        double sum=0;
        for (int i=0;i<10000;i++)
            sum+=i;
        Assert.assertEquals(3,calculate.add(1,2),0);
        System.out.print(sum);
    }
}
