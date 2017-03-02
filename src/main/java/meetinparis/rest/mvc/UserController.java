package meetinparis.rest.mvc;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import meetinparis.core.models.User;
import meetinparis.core.repositories.impl.UserRepositoryImpl;


@RestController
@RequestMapping(value = "/Users")
public class UserController {
	static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserRepositoryImpl userRepo;
	
	@RequestMapping(value= "/getAllUsers", method=RequestMethod.GET)
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	@RequestMapping(value= "/getUser/{_id}", method=RequestMethod.GET)
	public User findUserById(@PathVariable long _id){
		return userRepo.findUserById(_id);
	}
	
	@RequestMapping(value="/findUser/{email}/{password}", method=RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public User findUserWithMail(@PathVariable String email, @PathVariable String password){
		return userRepo.CheckUser(email, password);
	}
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public boolean addUser(@ModelAttribute("user") User user){
		if(user != null)
			return userRepo.insert(user) != null ? true : false;
		return false;
	}
	
	@RequestMapping(value="/updateUser", method=RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public boolean updateUser(@ModelAttribute("user") User user){
		User updatedUser = userRepo.findUserById(user.getId());
		if(updatedUser != null)
			return userRepo.save(user) != null ? true : false;
		return false;
	}
	
	@RequestMapping(value="/deleteUser/{_id}", method=RequestMethod.POST)
	@ResponseBody
	public void deleteUser(@PathVariable long _id){
		/*User deletedUser = userRepo.findUserById(_id);
		if(deletedUser != null)*/
		userRepo.delete(userRepo.findUserById(_id));
	}
	
	@RequestMapping(value="/findUserWithRange/{_id}/{distance}", method=RequestMethod.GET)
	public Map<User, Double> findUserWithRange(@PathVariable long _id, @PathVariable double distance){
		//TODO add actualLocation in User model for finding the actualLocation of the user
		//double userDistance = userRepo.findUserById(_id).getActualLocation();
		//TODO add a function in userRepository to find users close to the actual user
		return null;
	}
	
	@RequestMapping(value="/findByGender/{gender}", method=RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<User> findByGender(@PathVariable int gender){
		//TODO Implement findByGender in userRepository to find people by gender
		//TODO Implement findByAge in userRepository to find people by age
		return userRepo.findOnlineUsers();
	}
	
	@RequestMapping(value="/findOnlineUsers", method=RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<User> findOnlineUsers(){
		return userRepo.findOnlineUsers();
	}
	
	@RequestMapping(value="/whoLikesMe/{_id}", method=RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<User> whoLikesMe(@PathVariable long _id){
		//return userRepo.whoLikesMe(_id);
		//TODO add who likesMe in userRepo even whoLovesMe
		return null;
	}
}