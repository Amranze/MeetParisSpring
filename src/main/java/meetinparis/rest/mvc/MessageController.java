package meetinparis.rest.mvc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import meetinparis.core.models.Message;
import meetinparis.core.models.User;
import meetinparis.core.repositories.impl.MessageRepositoryImpl;
import meetinparis.core.repositories.impl.UserRepositoryImpl;

@RestController
@RequestMapping(value = "/Messages")
public class MessageController {
	static final Logger logger = LoggerFactory.getLogger(MessageController.class);
	private UserRepositoryImpl userRepo;
	private MessageRepositoryImpl messageRepo;

	@RequestMapping(value="/getAllMessages/{_id}", method=RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Message> getAllMessagesFromUser(@PathVariable long _id){
		//return messageRepo.findAllMessagesFromUser(_id);
		return null;
	}
	
	@RequestMapping(value="/getAllMessages/{_idFirstUser}/{_idSecondUser}", method=RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Message> getMessageBetweenUsers(@PathVariable long _idFirstUser, @PathVariable long _idSecondUser){
		//return messageRepo.findAllMessagesBetweenUsers(_idFirstUser, _idSecondUser);
		return null;
	}
	
	@RequestMapping(value="/MessageSeen/{_id}", method=RequestMethod.GET)
	public void setMessageSeen(@PathVariable long _id){
		//TODO implement findMessage in messageRepo
		//return messageRepo.findMessage(_id).setMessageSeen(true);
	}
	
	@RequestMapping(value="/MessageRead/{_id}", method=RequestMethod.GET)
	public void setMessageRead(@PathVariable long _id){
		//TODO implement findMessage in messageRepo
		//return messageRepo.findMessage(_id).setMessageRead(true);
	}
}