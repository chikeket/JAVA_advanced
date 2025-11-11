package com.example.demo.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.board.mapper.ReplyMapper;
import com.example.demo.board.service.ReplyService;
import com.example.demo.board.service.ReplyVO;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService{

	private final ReplyMapper replyMapper;
	
	@Override
	public int insert(ReplyVO board) {
		
		return replyMapper.insert(board);
	}

	@Override
	public int delete(Long bno) {		
		return replyMapper.delete(bno);
	}

	@Override
	public List<ReplyVO> getReply(Long bno) {		
		return replyMapper.getReply(bno);
	}

}
