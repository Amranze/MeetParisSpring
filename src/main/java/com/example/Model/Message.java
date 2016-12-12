package com.example.Model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Message implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String sender;
	private String reciver;
	private String message;
	private long timestamp;
	private String senderUrl;
	private boolean sent;
	private boolean read;
	
	public Message() {
		super();
	}

	public Message(long id, String sender, String reciver, String message, long timestamp, String senderUrl, 
			boolean sent, boolean read) {
		super();
		this.id = id;
		this.sender = sender;
		this.reciver = reciver;
		this.message = message;
		this.timestamp = timestamp;
		this.senderUrl = senderUrl;
		this.sent = sent;
		this.read = read;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReciver() {
		return reciver;
	}
	public void setReciver(String reciver) {
		this.reciver = reciver;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getSenderUrl() {
		return senderUrl;
	}
	public void setSenderUrl(String senderUrl) {
		this.senderUrl = senderUrl;
	}

	public boolean isSent() {
		return sent;
	}
	public void setSent(boolean sent) {
		this.sent = sent;
	}
	public boolean isRead() {
		return read;
	}
	public void setRead(boolean read) {
		this.read = read;
	}
	
	
}
