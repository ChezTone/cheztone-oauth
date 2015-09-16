<%@ taglib prefix="authz"
           uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Api</title>
    <meta name="_csrf" content="${_csrf.token}"/>
    <meta name="_csrf_header" content="${_csrf.headerName}"/>
</head>
<body>
    <authz:authorize access="hasRole('ROLE_USER')">
        <button onclick="getToken('${_csrf.token}')">getToken</button>
    </authz:authorize>
</body>
<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/api.js"></script>
</html>
