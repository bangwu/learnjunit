package hue.edu.imis.chapter04;

/**
 * Created by wubang on 14/11/14.
 */
public class ErrorResponse implements Response {

    private Request request;
    private Exception exception;

    public ErrorResponse(Request request, Exception exception) {
        this.request=request;
        this.exception=exception;
    }

    public Request getRequest() {
        return request;
    }

    public Exception getException() {
        return exception;
    }

    @Override
    public String getName() {
        return "Error";
    }
}
