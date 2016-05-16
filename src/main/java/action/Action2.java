package action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

public class Action2 extends BaseAction {

    private static final long serialVersionUID = -896629514297122058L;

    @Override
    @Action(value = "action2", results = {@Result(name = "success", location = "action2.jsp")})
    public String execute() {
        return SUCCESS;
    }

}
