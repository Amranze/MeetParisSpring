package meetinparis.core.repositories.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import meetinparis.core.models.Conversation;
import meetinparis.core.repositories.ConversationRepository;

@Repository
public class ConversationRepositoryImpl implements ConversationRepository{
	
	@Autowired
    MongoTemplate mongoTemplate;

	@Override
	public <S extends Conversation> List<S> save(Iterable<S> entites) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Conversation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Conversation> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Conversation> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Conversation> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Conversation> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Conversation> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Conversation> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Conversation> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Conversation findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Conversation> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Conversation entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Conversation> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Conversation> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Conversation> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Conversation> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Conversation> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Conversation> findAllConversationsFromUser(long _id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Conversation> findAllConversationsBetweenUsers(long _idUser1,
			long _idUser2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Conversation findLastConversationFromUser(long _id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Conversation findLastConversationToUser(long _id) {
		// TODO Auto-generated method stub
		return null;
	}
}
