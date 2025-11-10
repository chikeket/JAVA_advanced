package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//rest가 붙은 파일은 무조건 리턴이 data로만 넘어감
//
@RestController
public class HomeController {

	@GetMapping("/")
	public String hello() {
		return "hello";//페이지 바뀌는게 아니라 순수 데이터만 넘어감
	}
}
