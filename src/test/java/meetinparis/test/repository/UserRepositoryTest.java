package meetinparis.test.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import meetinparis.core.models.Conversation;
import meetinparis.core.models.Details;
import meetinparis.core.models.Message;
import meetinparis.core.models.SocialNetwork;
import meetinparis.core.models.User;
import meetinparis.core.models.Details.Gender;
import meetinparis.core.repositories.UserRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/application-config.xml" })
public class UserRepositoryTest {
	private Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);
	@Autowired
	private UserRepository userRepo;
	
	private User user;
	@Before
	public void setUp() {
		Message message = new Message(1L, "Amrane", "Simona", "Jeg elsker dig", 12121L, "", true, false, true);
		Message message1 = new Message(2L, "Simona", "Amrane", "As tave myliu", 12121L, "", true, false, true);
		Message message2 = new Message(3L, "Amrane", "Simona", "Mano mylima Zmona", 12121L, "", true, false, true);
		Message message3 = new Message(4L, "Simona", "Amrane", "what is love", 12121L, "", true, false, true);
		Message message4 = new Message(5L, "Amrane", "Simona", "Jeg elsker dig", 12121L, "", true, false, false);
		
		List<Message> messages = new ArrayList<Message>();
		messages.add(message);
		messages.add(message1);
		messages.add(message2);
		messages.add(message3);
		messages.add(message4);
		
		Conversation conversation = new Conversation(1L, 1L, 2L,messages);

		Map<Integer, Conversation> conversations = new HashMap<Integer, Conversation>();
		List<Integer> likes = new ArrayList<Integer>();
		likes.add(1);
		likes.add(2);
		likes.add(3);
		likes.add(4);
		conversations.put(121254, conversation);
		
		user = new User(1L, "Amrane", "Ait Zeouay", "amraneze", "a.zeouayamran@gmail.vom", "1584654", new Date(),
				23, Gender.MAN, "0514545", new Details(), "81 rue riquet", 75018, "Paris", "France", 2L,
				new Date().getTime(), true, true, conversations, new ArrayList<>(), "profilePicture",likes, null, null, new SocialNetwork()
				);
		
		User user1 = new User(2L, "Simona", "Rasytinyte", "simonara", "a.zeouayamran@gmail.vom", "1584654", new Date(),
				23, Gender.MAN, "0514545", new Details(), "81 rue riquet", 75018, "Paris", "France", 2L,
				new Date().getTime(), true, false, conversations, new ArrayList<>(), "profilePicture",likes, null, null, new SocialNetwork()
				);
		
		User user2 = new User(3L, "Hamada", "Ait Zeouay", "amraneze", "a.zeouayamran@gmail.vom", "1584654", new Date(),
				23, Gender.MAN, "0514545", new Details(), "81 rue riquet", 75018, "Paris", "France", 2L,
				new Date().getTime(), true, true, null, new ArrayList<>(), "profilePicture",null, null, null, null
				);
		User user3 = new User(4L, "Amine", "Bouchane", "aminebch", "a.zeouayamran@gmail.vom", "1584654", new Date(),
				23, Gender.MAN, "0514545", new Details(), "81 rue riquet", 75018, "Paris", "France", 2L, 
				new Date().getTime(), true, false, null, new ArrayList<>(), "profilePicture",null, null, null, null
				);
		userRepo.save(user);
		userRepo.save(user1);
		userRepo.save(user2);
		userRepo.save(user3);
	}
	@Test
	public void test(){
		logger.debug("Starting the Test");
		find();
	}
	
	public void find(){
		List<User> onlineUsers = userRepo.findOnlineUsers();
		//List<User> likes = userRepo.findWhoLikesMe(1L);
		for(User user : onlineUsers)
			logger.debug(user.toString());
	}
}
