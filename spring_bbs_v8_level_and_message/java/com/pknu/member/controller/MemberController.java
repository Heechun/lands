package com.pknu.member.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pknu.member.dto.MemberDto;
import com.pknu.member.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/joinCheckId.member")
	public void joinCheckId(String inputId, HttpServletResponse resp){
		System.out.println("AJAJAJAJAJAJ");
		memberService.joinCheckId(inputId, resp);
		
	}
	@RequestMapping(value="/joinForm.member")
	public String joinFormMember(){
		return "join";
	}
	
	@RequestMapping(value="/join.member", method = RequestMethod.POST)
	public String joinMember(MemberDto memberDto){
		memberService.joinMember(memberDto);
		return "redirect:/list.bbs?pageNum=1";
	}
	
	
}
