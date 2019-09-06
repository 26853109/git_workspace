<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>上班时间</td>
			<td>下班时间</td>
			<td>部门名称</td>
		</tr>
		<c:forEach items="${list}" var="w">
			<tr>
				<td>${w.wid}</td>
				<td>${w.wname}</td>
				<td>${w.stime}</td>
				<td>${w.etime}</td>
				<td>${w.name}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>