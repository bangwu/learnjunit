package hue.edu.imis.chapter04;

/**
 * Created by wubang on 14/11/14.
 */
public interface Controller {
    Response processRequest(Request request);
    void addHandler(Request request, RequestHandler requestHandler);
}
