package com.pknu.message.dto;

public class MessageDto {
	private int messageNum;
	private String sender;
	private String receiver;
	private String messageContent;
	private int messageStatus;
	private String messageDate;
	
	public String getMessageDate() {
		return messageDate;
	}
	public void setMessageDate(String messageDate) {
		this.messageDate = messageDate;
	}
	public int getMessageNum() {
		return messageNum;
	}
	public void setMessageNum(int messageNum) {
		this.messageNum = messageNum;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public int getMessageStatus() {
		return messageStatus;
	}
	public void setMessageStatus(int messageStatus) {
		this.messageStatus = messageStatus;
	}
	@Override
	public String toString() {
		return "MessageDto [messageNum=" + messageNum + ", sender=" + sender + ", receiver=" + receiver
				+ ", messageContent=" + messageContent + ", messageStatus=" + messageStatus + ", messageDate="
				+ messageDate + "]";
	}

	
	
	
	
}
