<%@page import="com.sun.xml.internal.ws.client.RequestContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	pageContext.setAttribute("p1", "page Scope");
	request.setAttribute("r1", "request Scope");
	session.setAttribute("s1", "session Scope");
	application.setAttribute("a1", "application Scope");
%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
pageContext.getAttribute("p1") : ${pageScope.p1}<br> 
request.getAttribute("s1") : ${requestScope.r1 }<br>
session : ${sessionScope.s1 }<br>
application : ${application.a1}<br>


</body>
</html>
