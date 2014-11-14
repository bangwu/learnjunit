package hue.edu.imis.chapter03;

/**
 * Created by wubang on 14/11/14.
 */
public interface RequestHandler {
    Response process(Request request) throws Exception;
}
