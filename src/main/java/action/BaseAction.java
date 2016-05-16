package action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

@InterceptorRef(value = "interceptorStack")
public class BaseAction extends ActionSupport implements ServletContextAware, ServletRequestAware, SessionAware {

    private static final long serialVersionUID = -8555789534280906959L;

    private ServletContext context;
    private HttpServletRequest request;
    private Map<String, Object> session;

    private boolean subRequest;

    @Override
    public String execute() throws Exception {
        return super.execute();
    }

    @Override
    public void setServletContext(ServletContext context) {
        this.context = context;
    }

    public ServletContext getServletContext() {
        return context;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletRequest getServletRequest() {
        return request;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public boolean isSubRequest() {
        return subRequest;
    }

    public void setSubRequest(boolean subRequest) {
        this.subRequest = subRequest;
    }

    public boolean isActionToTrack() {
        return true;
    }

}
