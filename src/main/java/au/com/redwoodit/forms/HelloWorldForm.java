package au.com.redwoodit.forms;

import org.apache.struts.action.ActionForm;

public class HelloWorldForm extends ActionForm {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}