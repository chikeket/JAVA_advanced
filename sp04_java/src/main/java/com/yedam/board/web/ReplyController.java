package com.yedam.board.web;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
public class ReplyController {

	private final ReplyService replyService;
	
	//등록
	@PostMapping("/reply")   //localhost/reply
	public int insert(@RequestBody ReplyVO vo) {
		return replyService.insert(vo);
		// {result : "success", data:""}
	}
	//삭제   //localhost/reply/10
	@DeleteMapping("/reply/{rno}")
	public int delete(@PathVariable("rno") Long rno) {	
		return replyService.delete(rno); 
	}
	
	//전체조회 //localhost/board/4/reply
	@GetMapping("/board/{bno}/reply")
	public List<ReplyVO> select(@PathVariable("bno") Long bno) {
		return replyService.getReply(bno);
	}
}
