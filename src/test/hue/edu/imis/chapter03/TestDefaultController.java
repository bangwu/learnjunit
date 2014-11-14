package test.hue.edu.imis.chapter03;

import hue.edu.imis.chapter03.DefaultController;
import hue.edu.imis.chapter03.Request;
import hue.edu.imis.chapter03.RequestHandler;
import hue.edu.imis.chapter03.Response;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wubang on 14/11/14.
 */
public class TestDefaultController {
    private DefaultController controller;
    private Request request;
    private RequestHandler requestHandler;

    @Before
    public void init(){
        controller=new DefaultController();
        request=new SimpleRequest();
        requestHandler=new SimpleRequestHamdler();
        controller.addHandler(request,requestHandler);
    }

    @Test
    public void testMethod(){
        throw new RuntimeException("implements me");
    }
    @Test
    public void testAddHandler(){
        RequestHandler requestHandler1=controller.getRequestHandler(request);
        Assert.assertEquals(requestHandler1,requestHandler);
    }

    @Test
    public void testProcessRequest(){
        Response response=controller.processRequest(request);
        Assert.assertNotNull(response);
        Assert.assertEquals("hello",response,new SimpleResponse());

    }

    private class SimpleRequest implements Request {
        private static final String NAME="Test";
        @Override
        public String getName() {
            return NAME;
        }

        @Override
        public boolean equals(Object o) {
            boolean result=false;
            if (o instanceof SimpleRequest){
                result=NAME.equals(((SimpleRequest) o).getName());
            }
            return result;
        }

        @Override
        public int hashCode() {
            return NAME.hashCode();
        }
    }

    private class SimpleRequestHamdler implements RequestHandler {
        @Override
        public Response process(Request request) throws Exception {
            return new SimpleResponse();
        }
    }

    private class SimpleResponse implements Response {
        private static final String NAME="Test";
        @Override
        public String getName() {
            return NAME;
        }

        @Override
        public boolean equals(Object o) {
            boolean result=false;
            if (o instanceof SimpleResponse){
                result=getName().equals(((SimpleResponse) o).getName());
            }
            return result;
        }

        @Override
        public int hashCode() {
            return NAME.hashCode();
        }
    }
}
