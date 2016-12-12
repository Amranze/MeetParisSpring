package com.example.Model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Conversation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String user_id1;
	private String user_id2;
	private List<Message> messages;
	
	public Conversation() {
		super();
	}


	public Conversation(String user_id1, String user_id2, List<Message> messages) {
		super();
		this.user_id1 = user_id1;
		this.user_id2 = user_id2;
		this.messages = messages;
	}


	public String getUser_id1() {
		return user_id1;
	}


	public void setUser_id1(String user_id1) {
		this.user_id1 = user_id1;
	}


	public String getUser_id2() {
		return user_id2;
	}


	public void setUser_id2(String user_id2) {
		this.user_id2 = user_id2;
	}


	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	
}
