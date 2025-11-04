package com.exam;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
/*
 * 단위테스트 -> 통합테스트 -> 인수테스트
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class EmpServiceTest {
	@Autowired
	Restaurant restaurant;
	
	
	@Autowired
	EmpService empService;
	
	@Test
	public void test2() {
		restaurant.order();
	}
	
	@Test
	public void test() {
		empService.register();
	}
}
