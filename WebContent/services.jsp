<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<!-- Removed connection details for security reasons -->

<%-- <%

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("", "", "");
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from service");
	while(rs.next())
		out.print(rs.getString("service_name")+"<br>");
%>
 --%>


<!-- Same above code using tags -->

 <sql:setDataSource var = "db" driver = "com.mysql.cj.jdbc.Driver"
         url = ""
         user = ""  password = ""/>
 
      <sql:query dataSource = "${db}" var = "rs">
         SELECT * from service;
      </sql:query>
 
      <table border = "1" width = "100%">
         <tr>
            <th>Service ID</th>
            <th>Service Name</th>
            <th>Service Fee</th>
         </tr>
         
         <c:forEach var = "row" items = "${rs.rows}">
            <tr>
               <td><c:out value = "${row.service_id}"/></td>
               <td><c:out value = "${row.service_name}"/></td>
               <td><c:out value = "${row.service_fee}"/></td>
            </tr>
         </c:forEach>
      </table>




</body>
</html>