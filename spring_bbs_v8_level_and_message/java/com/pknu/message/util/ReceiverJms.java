package com.pknu.message.util;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import com.pknu.message.dto.JmsVO;

public class ReceiverJms implements MessageListener{
	JmsVO jv;
	@Override
	public void onMessage(Message message) {		
		System.out.println(message+"111");
		if(message instanceof ObjectMessage){					
			try{	
				jv=(JmsVO)((ObjectMessage) message).getObject();
				System.out.println("리시버에서 받은 메시지"+jv.getJmsText());
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}	
}
