<%--
  Created by IntelliJ IDEA.
  User: НургалиевД
  Date: 20.02.2017
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
qwqwqwqwqwqwqw
<table>
    <c:forEach items="${students}" var="st">
        <tr>
            <td><c:out value="${st.name}" /></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
