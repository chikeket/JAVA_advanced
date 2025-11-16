package com.example.demo.book.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.service.BookVO;




@Mapper
public interface BookMapper {
	//등록
		int insert(BookVO board);
		
		int getMaxBno();
		
		List<BookVO> getBookList();
		
		List<BookVO> getRentList();
		
		BookVO getBook(Long bookNo);
}
