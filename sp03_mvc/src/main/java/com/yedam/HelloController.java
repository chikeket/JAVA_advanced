package com.yedam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //@Component subclass 1. 컨테이너에 bean 등록 2.컨트롤러화(상속대신) POJO클래스
//POJO란 상속안받고 쓸수있다?
public class HelloController {

	@GetMapping("/")
	public String hello() {		
		return "hello";
	}
}
