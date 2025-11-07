package com.yedam.board.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.yedam.board.service.ReplyVO;

@Mapper
public interface ReplyMapper {

	//등록
	int insert(ReplyVO board);
	//수정
//	int update(ReplyVO board);
	//삭제
	int delete(Long bno);
	//댓글목록
	List<ReplyVO> getReply(Long bno);
	
	//전체조회(검색)	
//	List<ReplyVO> getListByWriter(ReplyVO board);
	//페이징-전체건수조회
	

	

	
}
