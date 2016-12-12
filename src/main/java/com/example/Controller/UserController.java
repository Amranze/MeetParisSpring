package com.example.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.LocalDate;
import org.joda.time.Years;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Conversation;
import com.example.Model.User;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;


@RestController
@RequestMapping(value = "/Users")
public class UserController {
	
	static final Logger logger = LoggerFactory.getLogger(MessageController.class);
	private DBCollection userCollection = userMongodbConnection();
	private final String userDBCollectionName = "userAndroid";
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/Create", method = RequestMethod.POST)
	public boolean addUser(@RequestBody User user){
		try {
			LocalDate birthdate = new LocalDate (user.getBirthdate().getYear(), user.getBirthdate().getMonth(), user.getBirthdate().getDate());
			LocalDate now = new LocalDate();
			Years age = Years.yearsBetween(birthdate, now);
			
			BasicDBObject newUser = new BasicDBObject();
		
			newUser.put("id", user.getId());
			newUser.put("name", user.getName());
			newUser.put("lastname", user.getLastname());
			newUser.put("username", user.getUsername());
			newUser.put("mail", user.getMail());
			//TODO crypt the password
			newUser.put("password", user.getPassword());
			newUser.put("age", age.getYears());
			newUser.put("phone", user.getPhone());
			newUser.put("addresse", user.getAdresse());
			newUser.put("postalCode", user.getPostalCode());
			newUser.put("city", user.getCity());
			newUser.put("country", user.getCountry());
			newUser.put("lastConnection", new Date().getTime());
			newUser.put("active", true);
			newUser.put("conversations", new ArrayList<Conversation>());
			newUser.put("pictures", user.getPictures());

			userCollection.insert(newUser);
			return true;
		}
		catch (Exception e){
			logger.debug("Exeption in adding the user " +e);
			return false;
		}
	}
	
	@RequestMapping(value="/getUsers", method= RequestMethod.GET)
	public List<DBObject> getAllUsers(){
		DBCursor userDB = userCollection.find();
		List<DBObject> users = new ArrayList<>();
		int j=0;
		while(userDB.hasNext()){
			users.add(userDB.next());
			System.out.println(users.get(j++).toString());
		}
		return users;
	}

	private DBCollection userMongodbConnection() {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("test");
		DBCollection userCollection = db.getCollection(userDBCollectionName);
		return userCollection;
	}
}
