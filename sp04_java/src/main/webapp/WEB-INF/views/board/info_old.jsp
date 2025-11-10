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
		
	<script>
	
	let bno = ${board.bno};
	add(); //등록이벤트
	remove(); //삭제이벤트
	getList(); //전체조회
	/*-------------------------------
	* 댓글등록
	*/-------------------------------
	function add() {
	$(".btnInsert").on("click", e=>{
		//인풋태그값을 콘솔에 출력 val()
		const replyer = $(`[name="replyer"]`).val();
		const reply = $(`[name="reply"]`).val();			
			console.log(replyer,reply);
		fetch('/reply',{method: 'POST',
			  body: JSON.stringify({replyer, reply, bno}),
				  headers: {
				    'Content-type': 'application/json; charset=UTF-8',
				  },})
	    .then(response => response.json())//리턴값이 int라서 text로 리턴함
	    .then(response => {
	    	//getList();
	    	let data = response.data;
	    	let databoolean = response.result;
	    	console.log(databoolean);
	    	let reply = document.querySelector("#replyList");
	    	let newTag = `<div class="row md-2" data-rno="\${data.rno}">
			<div class="col">\${data.replyer}</div>
			<div class="col-7">\${data.reply}</div>
			<div class="col">
				<button class="btn btn-danger btnDelete me-3">삭제</button>
				<button class="btn btn-success btnUpdate">수정</button>
			</div>
		</div>`
		reply.insertAdjacentHTML("afterbegin", newTag); //afterbegin
	   }) //end of then
	}) //end of on("click",
		
	} //end of add()

	/*-------------------------------
	* 댓글조회
	*/-------------------------------
function getList() {
fetch(`http://localhost:81/board/\${bno}/reply`)
.then(response => response.json())
.then((datas) => {
	let reply = document.querySelector("#replyList");
	for(data of datas){
		let newTag = `<div class="row md-2" data-rno="\${data.rno}">
			<div class="col">\${data.replyer}</div>
			<div class="col-7">\${data.reply}</div>
			<div class="col">
				<button class="btn btn-danger btnDelete me-3">삭제</button>
				<button class="btn btn-success btnUpdate">수정</button>
			</div>
		</div>`
		reply.insertAdjacentHTML("beforeend", newTag);
	}
})
	
} //end of getList()

/*-------------------------------
* 댓글삭제
*/-------------------------------
function remove() {
$("#reply").on("click", ".btnDelete", (e) => {
	const rno = $(e.target).closest(".row").data("rno");
	console.log(rno);
	
	fetch(`/reply/\${rno}`,{method: 'DELETE'})
    .then(response => response.text())//리턴값이 int라서 text로 리턴함
    .then(result => {console.log(result);
    	$(e.target).closest(".row").remove();
    });
})
	
}//end of remove()
</script>
</body>
</html>