package com.example.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Message;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

@RestController
@RequestMapping(value = "/Messages")
public class MessageController {
	
	static final Logger logger = LoggerFactory.getLogger(MessageController.class);
	private DBCollection messageCollection = MongodbConnection();
	private final String messageDBCollectionName = "messageAndroid";
	private final String conversationDBCollectionName = "conversationAndroid";

	
	@RequestMapping(value="/SendMessage", method = RequestMethod.POST)
	public Boolean sendMessage(@RequestBody Message message){
		
		BasicDBObject newMessage = new BasicDBObject();
		
		newMessage.put("id", message.getId());
		newMessage.put("sender", message.getSender());
		newMessage.put("message", message.getMessage());
		newMessage.put("timestamp", message.getTimestamp());
		newMessage.put("senderurl", message.getSenderUrl());
		
		messageCollection.insert(newMessage);
		
		String username = message.getSender();
		String receiverUsername = message.getReciver();
		
		DBObject querySender = new BasicDBObject();
		querySender.put("username", username);
		DBCursor userSender = messageCollection.find(querySender);
	
		DBObject queryReceiver = new BasicDBObject();
		querySender.put("username", receiverUsername);
		DBCursor userReceiver = messageCollection.find(querySender);
		
		
		//userReceiver.
	
		
		return true;
	}

	private DBCollection MongodbConnection() {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("test");
		DBCollection messageCollection = db.getCollection(messageDBCollectionName);
		return messageCollection;
	}
}
