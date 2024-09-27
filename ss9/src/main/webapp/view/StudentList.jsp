<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Danh sách sinh viên</title>
</head>
<body>
<h2>Danh sách sinh viên</h2>
<table border="1">
    <tr>
        <th>STT</th>
        <th>Tên</th>
        <th>Mã lớp</th>
        
    </tr>

    <c:forEach var="student" items="${students}" varStatus="status">
        <tr>
            <td>${status.index + 1}</td>
            <td>${student.name}</td>
            <td>${student.classID}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
