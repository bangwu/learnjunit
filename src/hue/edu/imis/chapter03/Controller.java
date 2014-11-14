package hue.edu.imis.chapter03;

/**
 * Created by wubang on 14/11/14.
 */
public interface Controller {
    Response processRequest(Request request);
    void addHandler(Request request,RequestHandler requestHandler);
}
