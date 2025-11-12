package com.example.demo.security;

import org.springframework.security.core.context.SecurityContextHolder;

import com.example.demo.user.Service.UserVO;




public class SecuUtil {

	public static UserVO getUser() {
		Object obj = SecurityContextHolder.getContext().getAuthentication().getDetails();
		UserVO userDetails = null;
		System.out.println(obj);
		//if (! obj instanceof IsAnony) {
			userDetails = ((CustomerUser)obj).getUserDTO();
		//}
		//else { 
		//	userDetails = new UserDTO();
		//}
		return userDetails;
	}
}