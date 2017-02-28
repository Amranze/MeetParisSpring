package meetinparis.core.repositories.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import meetinparis.core.models.Message;
import meetinparis.core.repositories.MessageRepository;

@Repository
public class MessageRepositoryImpl implements MessageRepository{
	
	@Autowired
    MongoTemplate mongoTemplate;
	
	@Override
	public <S extends Message> List<S> save(Iterable<S> entites) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Message> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Message> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Message> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Message> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Message> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Message> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Message> findAll(Iterable<String> ids) {
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
	public void delete(Message entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Message> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Message> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Message> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Message> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Message> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Message> findAllMessagesFromUser(long _id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> findAllMessagesBetweenUsers(long _idUser1,
			long _idUser2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message findLastMessageFromUser(long _id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message findLastMessageToUser(long _id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message findMessage(long _id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMessageRead(long _id, boolean status) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMessageSeen(long _id, boolean status) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMessageRecieved(long _id, boolean status) {
		// TODO Auto-generated method stub
		
	}

}
