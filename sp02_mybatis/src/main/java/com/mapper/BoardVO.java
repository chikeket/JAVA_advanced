package com.mapper;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
//DTO, DO, VO
public class BoardVO {

	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate; //sql.Date는 yyyy-MM-dd Util.Date는 yyyy/MM/dd 차이만 있음
	private Date updatedate;
	
	List<ReplyVO> reply;
}
