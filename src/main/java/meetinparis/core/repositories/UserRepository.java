package meetinparis.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import meetinparis.core.models.Details.Gender;
import meetinparis.core.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	@Query
	public List<User> findAllUsers();
	@Query
	public User CheckUser(String email, String password);
	@Query
	public User findUserById(@Param(value = "_id") long _id);
	@Query
	public User findUserByName(String username);
	@Query
	public List<User> findUsersByLastTimeAdded();
	@Query
	public List<User> findActiveUsers();
	@Query
	public List<User> findOnlineUsers();
	@Query
	public List<User> findWhoLikesMe(@Param(value = "_id") long _id);
	@Query
	public List<User> findWhoLovesMe(@Param(value = "_id") long _id);
	@Query
	//change double with Location from 
	public List<User> findUsersCloseToMe(double location);
	@Query
	public List<User> findUsersByGender(Gender gender);
	@Query
	public List<User> findUsersByAge(int age);
	@Query
	public List<User> findUsersByAgeInterval(@Param(value = "_id") int minimalAge,
			@Param(value = "_id") int maximalAge);
	@Query
	public List<User> findWhoSawMe(@Param(value = "_id") long _id);
	@Query
	public List<User> findWhoISaw(@Param(value = "_id") long _id);
	//public List<User> findPeopleInMyCity(long _id);
	//public List<User> findPeopleInMyDepartement(long _id);
	
	//public List<User> findUsersByDetails(String name);
}
