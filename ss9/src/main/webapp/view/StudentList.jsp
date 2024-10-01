<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách học sinh</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h1>Danh sách học sinh lớp ${nameClass}</h1>
<button class="btn btn-primary" onclick="window.location.href='/Student?action=create'">Thêm mới</button>


<div class="mb-3" id="deleteSection" style="display: none;">
    <label for="deleteId" class="form-label">Nhập ID sinh viên để xóa:</label>
    <input type="text" id="deleteId" class="form-control" placeholder="Nhập ID">
    <button class="btn btn-danger mt-2" onclick="confirmDelete()">Xóa</button>
</div>
<table class="table table-hover">
    <thead>
    <tr>
        <th>STT</th>
        <th>ID</th>
        <th>Name</th>
        <th>ClassID</th>
        <th>Hành động</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${students}" var="student" varStatus="temp">
    <tr>
        <td>${temp.count}</td>
        <td>${student.name}</td>
        <td>${student.address}</td>
        <td>
            <a href="/Student?action=edit&id=${student.id}">Sửa</a>
            <a href="/Student?action=delete&id=${student.id}">Xoá</a>
    </c:forEach>
    </tbody>
</table>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
