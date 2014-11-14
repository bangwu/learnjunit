package test.hue.edu.imis.chapter01;

import org.junit.Test;

import hue.edu.imis.chapter01.HelloWorld;

/**
 * Created by wubang on 14/11/14.
 */
public class HelloWorldTest {

    @Test
    public void testSayHello(){
        new HelloWorld().sayHello("wubang");
    }
}
