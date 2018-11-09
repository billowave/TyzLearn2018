package tyz.actions.all;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

@SuppressWarnings("serial")
public class HelloWorldAction extends ActionSupport {

	private String message;

	/**
	 * @return message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            ÒªÉèÖÃµÄ message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public HelloWorldAction(String message) {
		super();
		this.message = message;
	}
	
	public HelloWorldAction() {

	}

	public String SayOut() {
		System.out.println("hello " + this.getClass().toString() + "  *-+ " + message);
		return message;
	}

	public String execute() throws Exception {
		ValueStack stack = ActionContext.getContext().getValueStack();
		Map<String, Object> context = new HashMap<String, Object>();

		context.put("key1", new String("This is key1"));
		context.put("key2", new String("This is key2"));
		stack.push(context);

		System.out.println("Size of the valueStack: " + stack.size());
		return "success";
	}

}
