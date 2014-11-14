package hue.edu.imis.chapter03;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wubang on 14/11/14.
 */
public class DefaultController implements Controller {

    private Map<String,RequestHandler> requestHandlers=new HashMap<String, RequestHandler>();
    @Override
    public Response processRequest(Request request) {
        Response response;
        try{
            response=getRequestHandler(request).process(request);
        }catch (Exception ex){
            response=new ErrorResponse(request,ex);
        }
        return response;
    }

    public RequestHandler getRequestHandler(Request request){
        if(!requestHandlers.containsKey(request.getName())){
            String message="Cannot find handler for request name ["+request.getName()+"]";
            throw new RuntimeException(message);
        }
        return requestHandlers.get(request.getName());
    }

    @Override
    public void addHandler(Request request, RequestHandler requestHandler) {
        if(requestHandlers.containsKey(request.getName())){
            String message="A request handler has already been registered for request name ["+request.getName()+"]";
            throw new RuntimeException(message);
        }
        else {
            this.requestHandlers.put(request.getName(),requestHandler);
        }
    }
}
