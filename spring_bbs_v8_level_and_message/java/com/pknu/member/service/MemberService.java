package com.pknu.member.service;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.pknu.member.dto.MemberDto;

public interface MemberService {
	public void joinMember(MemberDto memberDto);
	
	public void joinCheckId(String inputId, HttpServletResponse resp);
}
