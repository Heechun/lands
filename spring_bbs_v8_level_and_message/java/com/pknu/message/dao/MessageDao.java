package com.pknu.message.dao;

import java.util.HashMap;
import java.util.List;

import com.pknu.message.dto.MessageDto;

public interface MessageDao {
	public void sendMessage(MessageDto messageDto);
	
	public List<MessageDto> getArticles(HashMap<String, Integer> hm);
}
