

<%@page import="com.opensymphony.xwork2.ActionContext"%>

<%@page import="java.util.Iterator"%>
<%
	out.print("You are successfully registered");
	out.print(ActionContext.getContext().getContextMap().keySet().size());
	Iterator<String> it = ActionContext.getContext().getContextMap().keySet().iterator();
	while (it.hasNext()) {
		String str = it.next();
		//out.println(str + ActionContext.getContext().get(str));
		out.println(str + ActionContext.getContext().getValueStack().getContext().get(str)+"<br>");
		
	}
	out.println("<hr>");
	Iterator<Object> its = ActionContext.getContext().getContextMap().values().iterator();
	while (its.hasNext()) {
		Object str = its.next();
		//out.println(str + ActionContext.getContext().get(str));
		if(str!=null)
		out.println(str.toString() +"<br>");
		
	}
	
	
	

%>
