package com.container;

import java.util.Date;
//테이블 레코드 1건을 담기 emp = { id:1, fir:"aaa", ....}
//Employee 테이블 구조

import lombok.Builder;
import lombok.Data;

@Builder //생성자 대신 쓰는게 @Builder임
@Data
public class Employee {

	private int employeeId;
	private String firstName;
	private String email;
	private long salary;
	private Date hireDate;	
	
	
	
	
	
}
