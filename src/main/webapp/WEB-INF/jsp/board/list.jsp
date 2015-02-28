<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>게시판</title>
	<link href="/resources/css/board.css" rel="stylesheet">
	<script type="text/javascript" src="/resources/js/jquery-2.1.3.js"></script>
</head>
<body>
	<h3>게시판</h3>
	
	<table>
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>작성자</td>
		</tr>
		<c:forEach items="${boardList}" var="board">
		<tr>
			<td>${board.id}</td>
			<td><a href="/board/detail/${board.id}">${board.title}</a></td>
			<td>${board.author}</td>
		</tr>
		</c:forEach>
	</table>
	
	<button type="button" id="btnWriteForm">글쓰기</button>
	
	<script type="text/javascript">
		$('#btnWriteForm').click(function() {
			location.href = '/board/write/form';
		});
	</script>
</body>
</html>