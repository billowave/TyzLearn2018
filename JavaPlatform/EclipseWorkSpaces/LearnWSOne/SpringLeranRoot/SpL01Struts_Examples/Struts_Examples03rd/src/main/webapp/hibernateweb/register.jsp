
<%@page import="test.just.hibernate.webs.UserDao"%>
<jsp:useBean id="obj" class="test.just.hibernate.webs.User"></jsp:useBean>
<jsp:setProperty property="*" name="obj" />

<%
	out.print(obj.toString() + obj.getName());
	int i = UserDao.save(obj);
	if (i > 0) {
		out.print("You are successfully registered");
	}
%>
