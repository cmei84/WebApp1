package interceptor;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class ActionTimeInterceptor implements Interceptor {

    private static final long serialVersionUID = -5715368534772958951L;

    @Override
    public void destroy() {
    }

    @Override
    public void init() {
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {

        String result = invocation.invoke();

        Object action = invocation.getAction();

        System.out.println("Action '" + action.getClass().getSimpleName() + "' invoked...");

        return result;
    }

    public String getClientUserAgent(HttpServletRequest request) {
        return request.getHeader("USER-AGENT");
    }

}