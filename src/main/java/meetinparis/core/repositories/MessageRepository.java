package meetinparis.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import meetinparis.core.models.Message;

@Repository
public interface MessageRepository extends MongoRepository<Message, String>{
	@Query
	public List<Message> findAllMessagesFromUser(long _id);
	@Query
	public List<Message> findAllMessagesBetweenUsers(long _idUser1, long _idUser2);
	@Query
	public Message findLastMessageFromUser(long _id);
	@Query
	public Message findLastMessageToUser(long _id);
	@Query
	public Message findMessage(long _id);
	@Query
	public void setMessageRead(long _id, boolean status);
	@Query
	public void setMessageSeen(long _id, boolean status);
	@Query
	public void setMessageRecieved(long _id, boolean status);	
}
