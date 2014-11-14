package test.hue.edu.imis.chapter02;

import hue.edu.imis.chapter02.Calculate;
import hue.edu.imis.chapter02.HelloWorlds;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by wubang on 14/11/14.
 */
@RunWith(value = Parameterized.class)
public class ParameterizedTest {
    private double expected;
    private double valueOne;
    private double valueTwo;

    @Parameterized.Parameters
    public static Collection<Integer[]> getTestParameters(){
        return Arrays.asList(new Integer[][]{
                {2,1,1},
                {3,2,1},
                {4,3,1}
        });
    }

    public ParameterizedTest(double expected, double valueOne, double valueTwo) {
        this.expected = expected;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    @Test
    public void sum(){
        Calculate calculate=new Calculate();
        Assert.assertEquals(expected, calculate.add(valueOne, valueTwo),0);
    }
}
