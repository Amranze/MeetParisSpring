package meetinparis.rest.mvc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import meetinparis.core.models.Conversation;
import meetinparis.core.models.User;
import meetinparis.core.repositories.impl.ConversationRepositoryImpl;
import meetinparis.core.repositories.impl.MessageRepositoryImpl;
import meetinparis.core.repositories.impl.UserRepositoryImpl;

@RestController
@RequestMapping(value = "/Conversations")
public class ConversationController {
	static final Logger logger = LoggerFactory.getLogger(ConversationController.class);
	private UserRepositoryImpl userRepo;
	private MessageRepositoryImpl messageRepo;
	private ConversationRepositoryImpl conversationRepo;
	
	@RequestMapping(value="/getAllConversations/{_id}", method=RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Conversation> getAllConversations(@PathVariable long _id){
		//return conversationRepo.findAllConversationsFromUser(_id);
		return null;
	}
	
	@RequestMapping(value="/addConversation", method=RequestMethod.POST)
	public boolean addConversation(@ModelAttribute("conversation") Conversation conversation){
		if(conversation != null)
			return conversationRepo.save(conversation) != null ? true : false;
		return false;
	}
	
	@RequestMapping(value="/updateConversation", method=RequestMethod.POST)
	public boolean updateConversation(@ModelAttribute("conversation") Conversation conversation){
		if(conversation != null)
			return conversationRepo.save(conversation) != null ? true : false;
		return false;
	}
	
	@RequestMapping(value="/deleteConversation/{_id}", method=RequestMethod.POST)
	public void deleteConversation(@PathVariable long _id){
		conversationRepo.delete(String.valueOf(_id));
	}
	
	@RequestMapping(value="/deleteAllConversationWithUser/{_idPrimaryUser}/{_idUser}", method=RequestMethod.POST)
	public void deleteAllConversationWithUser(@PathVariable long _idPrimaryUser, @PathVariable long _idUser){
		//Add Map<Conversation, String> in User model
		User user = userRepo.findUserById(_idPrimaryUser);
		//List<Conversation> conversations = user.getConversations().parallelStream().;
	}
	
	@RequestMapping(value="/deleteAllConversationWithUser/{_id}", method=RequestMethod.POST)
	public void deleteAllConversation(@PathVariable long _id){
		//Add Map<Conversation, String> in User model
		User user = userRepo.findUserById(_id);
		user.setConversations(null);
		userRepo.save(user);
	}
}