package com.example.Controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Conversation;
import com.example.Model.User;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

@RestController
@RequestMapping(value = "/Conversations")
public class ConversationController {
	
	static final Logger logger = LoggerFactory.getLogger(ConversationController.class);
	private DBCollection conversationCollection = MongodbConnection();
	private final String conversationDBCollectionName = "conversationAndroid";
	
	@RequestMapping(value="/getAllConversation", method=RequestMethod.GET)
	public List<DBObject> getAllConversations(@RequestBody User userSender){
		List<DBObject> conversations = new ArrayList<>();
		
		DBObject query = new BasicDBObject();
		query.put("user_id1", userSender.getUsername());
		query.put("user_id2", userSender.getUsername());
		
		DBCursor conversationDB = conversationCollection.find(query);
		int i=0;
		while(conversationDB.hasNext()){
			conversations.add(conversationDB.next());
			logger.debug(conversations.get(i++).toString());
		}
		return conversations;
	}
	
	@RequestMapping(value="/getConversation", method=RequestMethod.GET)
	public List<DBObject> getConversations(@RequestBody User userSender, @RequestBody User userReceiver){
		List<DBObject> conversations = new ArrayList<>();
		
		DBObject query = new BasicDBObject();
		query.put("user_id1", userSender.getUsername());
		query.put("user_id2", userReceiver.getUsername());
		DBObject query1 = new BasicDBObject();
		query.put("user_id1", userReceiver.getUsername());
		query.put("user_id2", userSender.getUsername());
		// Adding or
		BasicDBList or = new BasicDBList();
		or.add(query1);
		or.add(query);
		
		DBObject queryOr = new BasicDBObject("$or", or);
		
		DBCursor conversationDB = conversationCollection.find(queryOr);
		int i=0;
		while(conversationDB.hasNext()){
			conversations.add(conversationDB.next());
			logger.debug(conversations.get(i++).toString());
		}
		return conversations;
	}
	
	private DBCollection MongodbConnection() {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("test");
		DBCollection messageCollection = db.getCollection(conversationDBCollectionName);
		return messageCollection;
	}

}
