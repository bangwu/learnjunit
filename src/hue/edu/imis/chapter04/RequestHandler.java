package hue.edu.imis.chapter04;

/**
 * Created by wubang on 14/11/14.
 */
public interface RequestHandler {
    Response process(Request request) throws Exception;
}
