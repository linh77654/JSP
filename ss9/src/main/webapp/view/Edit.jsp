<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="bai1.model.Student" %>
<html>
<head>
  <title>Sửa sinh viên</title>
</head>
<body>
<% Student student = (Student) request.getAttribute("student"); %>
<form method="post" action="/Student?action=edit&id=<%= student.getId() %>">
  <label for="name">Tên:</label>
  <input id="name" name="name" value="<%= student.getName() %>">
  <label for="classID">Mã lớp:</label>
  <input id="classID" name="classID" value="<%= student.getClassID() %>">
  <button type="submit">Cập nhật</button>
</form>

</body>
</html>
