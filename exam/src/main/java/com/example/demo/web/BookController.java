package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.BookService;
import com.example.demo.service.BookVO;

@Controller
public class BookController {

	@Autowired
	BookService bookService;

	// 마지막번호조회
	@GetMapping("/register")
	public String MaxNum(Model model) {
		model.addAttribute("MaxBno", bookService.getMaxBno());
		return "register";
	}

	// 등록페이지
	@PostMapping("/save")
	public String registerpage(BookVO book) {
		bookService.insert(book);
		return "redirect:/register";
	}

	// 조회페이지
	@GetMapping("/list")
	public String bookList(Model model) {
		model.addAttribute("list", bookService.getBookList());
		return "list";
	}

	// 대여조회페이지
	@GetMapping("/rent")
	public String rentList(Model model) {
		model.addAttribute("rent", bookService.getRentList());
		return "rentlist";
	}

	// 단건조회
	@GetMapping("/book/info")
	public String info(@RequestParam("bookNo") Long bookNo, Model model) {
		model.addAttribute("book", bookService.getBook(bookNo));
		return "detail";
	}

}
