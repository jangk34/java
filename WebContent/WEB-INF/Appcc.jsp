<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� ������ ��� ��</title>
</head>
<body>
 	<% 
 		String appPath = application.getContextPath();
 		String filePath = application.getRealPath("/subl/Intro.html");
 	%>
 	�� ���ø����̼��� UTL ��θ�: <%= appPath %> <br>
 	/subl/Intro.html�� ���� ��θ�: <%= filePath %> <br>
</body>
</html>