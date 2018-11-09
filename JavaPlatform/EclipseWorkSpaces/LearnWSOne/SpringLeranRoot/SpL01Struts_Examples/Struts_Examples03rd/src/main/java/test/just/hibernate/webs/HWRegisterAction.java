package test.just.hibernate.webs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class HWRegisterAction extends ActionSupport {

	public String execute() {
		ValueStack stack = ActionContext.getContext().getValueStack();
		Map<String, Object> context = new HashMap<String, Object>();

		context.put("key1", new String("This is key1"));
		context.put("key2", new String("This is key2"));
		stack.push(context);

		Iterator<String> it = stack.getContext().keySet().iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str + stack.getContext().get(str));
		}

		System.out.println("Size of the valueStack: " + stack.size());

		User user = new User(222, "123", "111", "tt@fs");

		return "success";

	}

}
