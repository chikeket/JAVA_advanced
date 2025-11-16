package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.book.mapper.BookMapper;
import com.example.demo.service.BookService;
import com.example.demo.service.BookVO;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

	private final BookMapper bookMapper;
	
	@Override
	public int insert(BookVO board) {		
		return bookMapper.insert(board);
	}

	@Override
	public int getMaxBno() {		
		return bookMapper.getMaxBno();
	}

	@Override
	public List<BookVO> getBookList() {		
		return bookMapper.getBookList();
	}

	@Override
	public List<BookVO> getRentList() {
		
		return bookMapper.getRentList();
	}

	@Override
	public BookVO getBook(Long bookNo) {		
		return bookMapper.getBook(bookNo);
	}

}
