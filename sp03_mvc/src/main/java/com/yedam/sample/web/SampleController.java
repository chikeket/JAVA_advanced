package com.yedam.sample.web;



import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.log4j.Log4j2;

// @Log4j2 <-lombok기능중 하나임
@Log4j2
@Controller
@RequestMapping("/sample/*")
public class SampleController {

	@GetMapping("/success")
	public String success() {
		return "/success";
	}
	
	@RequestMapping(value = {"insert", "/"}, method = {RequestMethod.POST,RequestMethod.GET}) //  /sample
	public void basic() {
		log.info("basic....");
	}
	
	@GetMapping("/ex01")  //ex01?name=aaa&age=15
	public String ex01(@ModelAttribute("sample") SampleDTO sample, RedirectAttributes ra) {
		log.info("sampleDTO: "+sample);
		ra.addFlashAttribute("msg", "가입축하");
		ra.addAttribute("name", sample.getName());
		//return "redirect:/success"; // http://localhost:81/success
		                              // redirect 뒤에는 매핑 url적어줌 스테이터스는 302로 뜸
		                              // forward 뒤에는 페이지명
		//return "redirect:success";  // 상대경로: http://localhost:81/sample/success
		return "redirect:/sample/success";
	}
	
	//ex02?name=aaa&age=20 int값은 원래  null 못들어오는데 그럴때 Integer로 적으면 됨
	//아니면 required = false,defaultValue = "10"를 추가로 넣으면 해당하는 값이 없을때 defaultValue에 입력된 값으로 입력된다
	@GetMapping("/ex02") 
	public String ex02(@RequestParam("name") String name, @RequestParam(value =  "age", required = false,defaultValue = "10") int age) {
		log.info(name + ":"+age);
		return "ex02"; //이게 forward 방식임
	}
	
	@GetMapping("/ex02Array") //ex02Array?ids=3&ids=4&ids=10 다건 삭제할때 이렇게 활용하면 됨
	public void ex02Array(@RequestParam("ids") List<String>ids  ) {
		log.info("ids:"+ids);
	}
	
	@GetMapping("/ex03")
	public ModelAndView ex03() {
		ModelAndView mv = new ModelAndView("/hello", "greet", "hi");
		//밑에 저렇게 적어도 되고 위에 객체 생성할때 매개변수로 적어도 됨
//		mv.setViewName("/hello");
//		mv.addObject("greet", "hi");
		return mv;
	}
}
