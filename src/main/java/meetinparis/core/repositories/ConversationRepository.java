package meetinparis.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import meetinparis.core.models.Conversation;

@Repository
public interface ConversationRepository extends MongoRepository<Conversation, String>{
	@Query
	public List<Conversation> findAllConversationsFromUser(long _id);
	@Query
	public List<Conversation> findAllConversationsBetweenUsers(long _idUser1, long _idUser2);
	@Query
	public Conversation findLastConversationFromUser(long _id);
	@Query
	public Conversation findLastConversationToUser(long _id);
}
