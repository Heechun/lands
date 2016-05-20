package com.pknu.message.dto;

import java.io.Serializable;

public class JmsVO implements Serializable {
	String jmsText;

	public String getJmsText() {
		return jmsText;
	}

	public void setJmsText(String jmsText) {
		this.jmsText = jmsText;
	}

	@Override
	public String toString() {
		return "JmsVO [jmsText=" + jmsText + "]";
	}
	
	
}
