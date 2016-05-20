package com.pknu.message.service;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.pknu.message.util.Page;
import com.pknu.message.dao.MessageDao;
import com.pknu.message.dto.MessageDto;
import com.pknu.message.util.SenderJms;

@Service	
public class MessageServiceImpl implements MessageService{

	@Autowired
	MessageDao messageDao;
	
	@Resource
	Page page;
	List<MessageDto> messageList;
	
	@Inject
	SqlSession session;
	private String namespace="com.pknu.mapper.message.message";
	
	@Resource
	private SenderJms senderJms;	
	
	@Override
	public void sendMessage(MessageDto messageDto) {
		senderJms.sendJms(messageDto);
		messageDao.sendMessage(messageDto);
	}

	@Override
	public ModelAndView messageList(int pageNum) {
		ModelAndView mav = new ModelAndView();
		
//		articleList = new ArrayList<>();
		int totalCount=0;
		int pageSize=10; // 한 페이지에 보여줄 게시글의 갯수
		int pageBlock=10; // 한 블럭당 보여줄 페이지 갯수. 게시판 하단에 숫자
		
//		totalCount = messageDao.getArticleCount();
		page.paging(pageNum, totalCount,pageSize,pageBlock);
		
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("startRow", page.getStartRow());
		hm.put("endRow", page.getEndRow());
		messageList= messageDao.getArticles(hm);
		
		mav.addObject("totalCount", totalCount);
		mav.addObject("messageList", messageList);
		mav.addObject("pageNum", pageNum);
		mav.addObject("pageCode", page.getSb().toString());
		mav.setViewName("loginOk");
		
		return mav;
	}

}
