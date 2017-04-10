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
	<script type="text/javascript" src="/resources/js/angular.min.js"></script>
	<script type="text/javascript" src="/resources/js/list.js"></script>
</head>
<body ng-app="boardApp" ng-controller="boardCtrl" ng-init="init()">
	<h3>게시판</h3>
	
	<table>
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>작성자</td>
		</tr>
		<tr ng-repeat="board in boardList">
			<td>{{board.id}}</td>
			<td><a href="/board/detail/{{board.id}}">{{board.title}}</a></td>
			<td>{{board.author}}</td>
			<td><a href="javascript:;" ng-click="remove(board.id)">삭제</a></td>
		</tr>
	</table>
	
	<button type="button" id="btnWriteForm" ng-click="goWrite()">글쓰기</button>
	
</body>
</html>