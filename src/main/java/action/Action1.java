package action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

public class Action1 extends BaseAction {

    private static final long serialVersionUID = 2691552858648284667L;

    @Override
    @Action(value = "action1", results = {@Result(name = "success", location = "action1.jsp")})
    public String execute() {
        return SUCCESS;
    }

}
