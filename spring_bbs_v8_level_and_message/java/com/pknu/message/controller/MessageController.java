package com.pknu.message.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pknu.message.dto.MessageDto;
import com.pknu.message.service.MessageService;

@Controller
public class MessageController {
	
	@Autowired
	MessageService messageService;
	
	@RequestMapping("/send.message")
	public ModelAndView sendMessage(@ModelAttribute("messageDto") MessageDto messageDto, HttpSession session,@ModelAttribute("receiver") String receiver, String pageNum){
		
		messageDto.setSender((String)session.getAttribute("id"));
		messageDto.setReceiver(receiver);
		System.out.println(messageDto.getMessageContent()+"    [sender] = "+messageDto.getSender()
							+"    [receiver] = "+messageDto.getReceiver());
		
		messageService.sendMessage(messageDto);
		
		return new ModelAndView("redirect:/list.bbs?pageNum="+pageNum);
	}
	
	@RequestMapping("/read.message")
	public ModelAndView readMessage(@RequestParam("pageNum") int pageNum){
		
		return messageService.messageList(pageNum);
	}
	

}
