<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<!-- Removed connection details for security reasons -->

<%

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("", "", "");
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from service");
	while(rs.next())
		out.print(rs.getString("service_name")+"<br>");
%>

</body>
</html>