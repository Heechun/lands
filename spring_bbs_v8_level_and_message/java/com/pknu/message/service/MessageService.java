package com.pknu.message.service;

import org.springframework.web.servlet.ModelAndView;

import com.pknu.message.dto.MessageDto;

public interface MessageService {

	public void sendMessage(MessageDto messageDto);
	
	public ModelAndView messageList(int pageNum);
}
