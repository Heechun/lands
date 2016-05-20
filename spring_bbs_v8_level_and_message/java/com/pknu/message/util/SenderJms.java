package com.pknu.message.util;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.pknu.message.dto.JmsVO;
import com.pknu.message.dto.MessageDto;

public class SenderJms {
	@Resource JmsTemplate jmsTemplate;
		
		public void sendJms(MessageDto messageDto){
			final JmsVO jv=new JmsVO();
			System.out.println("보내기");
			jv.setJmsText(messageDto.getMessageContent());
			jmsTemplate.send(
					new MessageCreator(){
	
						@Override
						public Message createMessage(Session sess) throws JMSException {
							System.out.println("보내는곳");
							
							return sess.createObjectMessage(jv);
						}
						
					});
			System.out.println("보내기 완료");
		}
}
