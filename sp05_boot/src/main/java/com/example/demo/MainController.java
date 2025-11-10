package com.example.demo;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/main")
	public String hello(Model model) {
		model.addAttribute("serverTime", new Date());
		return "main"; // template/main.html 이렇게 페이지를 불러옴 @Controller이거 붙은 파일은 그렇게 작동함
	}
}
