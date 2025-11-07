package com.yedam.emp.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;
import com.yedam.config.DataSourceConfig;
import com.yedam.config.MybatisConfig;
import com.yedam.config.RootConfig;
@SpringJUnitConfig(classes = {DataSourceConfig.class, MybatisConfig.class, RootConfig.class})
public class ReplyServiceTest {

	@Autowired
	ReplyService resplyService;
	
	@Disabled
	@Test
	public void testReply() {
		ReplyVO replyVO = new ReplyVO();
		replyVO.setReply("댓글등록테스트");
		replyVO.setReplyer("록테트");
		replyVO.setBno(2l);
		int result = resplyService.insert(replyVO);
		assertEquals(result, 1);
	}
	
	@Test
	public void testlist() {		
		
		List<ReplyVO> result = resplyService.getReply(1l);
		for(ReplyVO repl : result) {			
			System.out.println(repl);
		}
	}
}
