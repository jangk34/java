<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page contentType= "text/html; charset=euc-kr "%>  
    <%@page import= "java.util.GregorianCalendar "%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>��¥�� �ð�</title>
</head>
<body>
<% 
GregorianCalendar now = new GregorianCalendar();
	String date = String.format("%TF", now);
	String time = String.format("%TT", now);
%>
	������ ��¥ : <%=date %><br>
	������ �ð� : <%=time %><br>
</body>
</html>