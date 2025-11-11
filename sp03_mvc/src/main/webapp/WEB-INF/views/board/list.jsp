<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags"%>
<title>board/list.jsp</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
	crossorigin="anonymous">
</head>
<body>
${header["user-agent"]}
<hr>
쿠키:${cookie.JSESSIONID.value }
	<div class="container-lg">
		<a href="http://localhost:81/board/register">등록하기 바로가기</a>
		<my:header />
		<my:search />
		<div>총게시글수 ${fn:length(list)}</div>
		<c:forEach items="${list}" var="board" varStatus="status">
		<c:if test="${ status.first}"><div>목록시작</div></c:if>
			<div class="row mt-5">
				<div class="col">${status.count}</div>
				<div class="col">${board.bno}</div>
				<div class="col"><a href="/board/update?bno=${board.bno }">${board.writer}</a></div>
				<div class="col">${board.title}</div>
			</div>
			<div class="row">
				<div class="col">${board.content}</div>
			</div>
			<c:if test="${not empty board.reply}">
				<div class="card">
					<div class="header">댓글목록</div>
					<div class="body">
						<c:forEach items="${board.reply}" var="reply">
							<div class="row border">
							<div class="col-md-1">${reply.rno}</div>
							<div class="col-md-8">${reply.reply}</div>
							<div class="col-md-3">${reply.replyer}</div>								
							</div>
						</c:forEach>
					</div>
				</div>
			</c:if>
		</c:forEach>

	</div>
</body>
</html>