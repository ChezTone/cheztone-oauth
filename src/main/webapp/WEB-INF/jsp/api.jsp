<%--
  Created by IntelliJ IDEA.
  User: 20004507
  Date: 15/09/2015
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Api</title>
    <meta name="_csrf" content="${_csrf.token}"/>
    <meta name="_csrf_header" content="${_csrf.headerName}"/>
</head>
<body>
<button onclick="getToken('${_csrf.token}')">getToken</button>
</body>
<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/api.js"></script>
</html>
