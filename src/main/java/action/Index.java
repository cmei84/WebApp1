package action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

public class Index extends BaseAction {

    private static final long serialVersionUID = -896629514297122058L;

    @Override
    @Action(value = "", results = {@Result(name = "success", location = "index.jsp")})
    public String execute() {
        return SUCCESS;
    }

}
