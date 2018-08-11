<%--
  Created by IntelliJ IDEA.
  User: Denys.Prokopiuk
  Date: 8/11/2018
  Time: 11:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td><%="A"%></td>
            <td><%="B"%></td>
        </tr>
        <tr>
            <td><%="C"%></td>
            <td><%="D"%></td>
        </tr>
        <tr>
            <td><%=request.getParameter("user")%></td>
            <td><%=request.getParameter("type")%></td>
        </tr>
    </table>
    <%m();%>


</body>
</html>



<%!
    private String titlt = "tttt";

    private void m(){
        for(int i=0;i<10;i++){
            System.out.println("JSP #"+i);
        }
    }
%>