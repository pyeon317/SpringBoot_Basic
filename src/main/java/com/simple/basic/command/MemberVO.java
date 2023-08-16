package com.simple.basic.command;

import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {

	@Pattern(regexp = "[a-zA-Z0-9]{8,}", message = "아이디는 8자 이상")
	private String id;
	@Pattern(regexp = "^(?=.*\\d)(?=.*[a-zA-Z!@#$%^&*()_+{}|:\"<>?\\[\\]\\\\;',./]).{8,}$",
			 message = "비밀번호 특수문자 포함 8자 이상")
	private String pw;
	
	
	
	
	
	
}
