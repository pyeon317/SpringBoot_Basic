package com.simple.basic.command;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemoVO {

	private Integer mno;
	
	@NotBlank(message = "내용은 필수 입니다")
	private String memo;
	@Pattern(regexp = "\\d{2,3}-\\d{3,4}-\\d{4}", message = "전화번호 형식이어야 합니다")
	private String phone;
	@Pattern(regexp = "[0-9]{4}", message = "비밀번호는 4자리 숫자입니다")
	private String pw;
	private String secret;
}
