<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>
		<%-- <c:if test="${empty board.bno }">게시글등록</c:if>
<c:if test="${not empty board.bno }">게시글수정</c:if> --%>
		게시글 ${empty board.bno ? "등록" : "수정"}
	</h3>
	<form name="frm" action="${empty board.bno ? "
		/board/register" : "/board/update"}" method="post">
		<input type="hidden" name="bno" value="${board.bno }"> 제목<input
			name="title" value="${board.title }"><br> 작성자<input
			name="writer" value="${board.writer }"><br> 내용
		<textarea name="content" rows="" cols="">${board.content }</textarea>
		<br>
		<button>등록</button>
		<a href="http://localhost:81/board">리스트로 돌아가기</a>
		<c:if test="${not empty board.bno }">
			<button type="button" onclick="boardDelete()">삭제</button>
		</c:if>
	</form>
</body>
<script>
	function boardDelete() {
		if (confirm('삭제할까요')) {
			document.frm.action = "/board/delete"
			document.frm.submit();
		}
	}
</script>
</html>