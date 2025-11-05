<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/board/register" method="post">
제목<input name="title"><br>
작성자<input name="writer"><br>
내용<textarea name="content" rows="" cols=""></textarea><br>
<button>등록</button><a href="http://localhost:81/board">리스트로 돌아가기</a>
</form>
</body>
</html>