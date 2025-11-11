package com.example.demo.board.service;

import java.util.List;

public interface ReplyService {	
	
	int insert(ReplyVO board) ;
	
	int delete(Long bno) ;
	
	List<ReplyVO> getReply(Long bno) ;

}
