//Creating a JSP file index.jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Sessions</title>
</head>
<body>
<%
  if (request.getParameter("error") != null)
          out.println("<b>Your session has expired or is invalid.</b><br>");
%>
<form action="login.jsp" metho="post">
  Name <input name="name" id="name" maxlength=40><br>
  Password <input type="password" name="pwd" id="pwd" maxlength="10"><br>
  <button>Submit</button>
  
</form>
</body>
</html>

//Creating a JSP file login.jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%

        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        
        if (name == null || name.equals("") || pwd == null || pwd.equals("")) {
                response.sendRedirect("index.jsp?error=1");
        } else {
                
                session.setAttribute("name", name);
                response.sendRedirect("dashboard.jsp");
                
        }
%>

//Creating a JSP file dashboard.jsp

<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>
<%
        if (session.getAttribute("name") == null) {
                response.sendRedirect("index.jsp?error=1");
        }
%>
<b>Hello <%= session.getAttribute("name") %></b><br>
<a href="logout.jsp">Click here to logout</a>
</body>
</html>

//Creating a JSP file logout.jsp

<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Logout</title>
</head>
<body>
<%
        session.invalidate();
%>
<b>Your session has terminated.</b><br>
<a href="index.jsp">Login again</a>
</body>
</html>

