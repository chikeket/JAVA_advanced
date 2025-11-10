<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
	crossorigin="anonymous">
</head>
<body>
	<h3>게시글 상세보기</h3>
	<div>${board.bno}</div>
	<div>작성자: ${board.writer}</div>
	<div>내용: ${board.content}</div>
	<div id="replyForm">
		<input id="replyer" name="replyer"> <input id="reply"
			name="reply">
		<button type="button" class="btnInsert">댓글작성</button>
	</div>
	<div id="replyList"></div>
	<script src="https://code.jquery.com/jquery-3.7.1.min.js"
		integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
		crossorigin="anonymous"></script>
		<script >
		var bno = ${board.bno};
		</script>
		<script src="resources/reply.js"></script>
	
</body>
</html>