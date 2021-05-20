<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="design.css">
</head>
<body>
<h2 align="center">CRUD OPERATIONS ON LAPTOP DATA</h2>
 <table id="emp">
  <thead>
     <tr>
       <th>Laptop ID</th>
       <th>Laptop BRAND</th>
       <th>Laptop GENERATION</th>
       <th>Laptop RAM</th>
      </tr> 
  </thead>
  <tbody>
  
  <%
       ResultSet rs = (ResultSet)request.getAttribute("rs");
       while(rs.next())
       {
         %>
	       <tr>
		       <td><%= rs.getString(1)%></td>
		       <td><%= rs.getString(2)%></td>
		       <td><%= rs.getString(3)%></td>
		       <td><%= rs.getInt(4)%></td>
	      </tr> 
        <%
       }
    %>   
  </tbody>  
</table>

<div>
  <form action="UpdateLap.jsp">
  <button type="submit" class="updatebtn">UPDATE</button>
  </form>
  <form action="DeleteLap.jsp">
  <button type="submit" class="deletebtn">DELETE</button>
  </form>
  <form action="InsertLap.jsp">
  <button type="submit" class="insertbtn">INSERT</button>
  </form>
</div>
 
</body>
</html>