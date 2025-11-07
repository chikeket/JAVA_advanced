package com.yedam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.yedam.exam.Chef;
import com.yedam.exam.Restaurant;

@Configuration
//@EnableAspectJAutoProxy
@ComponentScan(basePackages = { "com.yedam" })
public class RootConfig {
	
	  @Bean public Chef chef() { return new Chef(); }
	  
	  //prototype은 객체 생성할때마다 만들어짐
	  //singleton은 걍 한개임
	  @Bean 
	  @Scope("prototype")
	  public Restaurant restaurant() { return new Restaurant(chef()); }
	 
	
}
