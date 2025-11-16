package com.example.demo.service;

import java.util.List;

public interface BookService {

	// 등록
	int insert(BookVO board);

	// 마지막도서번호 조회
	int getMaxBno();
	
	List<BookVO> getBookList();
	
	List<BookVO> getRentList();
	//상세페이지
	BookVO getBook(Long bookNo);
}
