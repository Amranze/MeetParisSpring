package meetinparis.core.repositories.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import meetinparis.core.models.Details.Gender;
import meetinparis.core.models.User;
import meetinparis.core.repositories.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
    MongoTemplate mongoTemplate;

	@Override
	public <S extends User> List<S> save(Iterable<S> entites) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		return mongoTemplate.findAll(User.class);
	}

	@Override
	public List<User> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<User> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S save(S entity) {
		if(entity != null)
			mongoTemplate.save(entity);
		return entity;
	}

	@Override
	public User findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<User> findAll(Iterable<String> ids) {
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
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends User> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends User> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends User> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserById(long _id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserByName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findUsersByLastTimeAdded() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findActiveUsers() {
		return mongoTemplate.find(new Query().addCriteria(Criteria.where("active").is(true)), User.class);
	}

	@Override
	public List<User> findOnlineUsers() {
		return mongoTemplate.find(new Query().addCriteria(Criteria.where("online").is(true)), User.class);
	}

	@Override
	public List<User> findWhoLikesMe(long _id) {
		List<Integer> usersId = mongoTemplate.findById(_id, User.class).getLikes();
		List<User> users = new ArrayList<User>();
		//Query query = new Query();
		for(Integer i : usersId){
			//query.addCriteria(Criteria.where("_id").is(i));
			//users.add(mongoTemplate.findById(id, entityClass)(query, User.class));
			users.add(mongoTemplate.findById(i, User.class));
		}
		return users;
	}

	@Override
	public List<User> findWhoLovesMe(long _id) {
		List<Integer> usersId = mongoTemplate.findById(_id, User.class).getLikes();
		List<User> users = new ArrayList<User>();
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").in(usersId));
		return mongoTemplate.find(query, User.class);
	}

	@Override
	public List<User> findUsersCloseToMe(double location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findUsersByGender(Gender gender) {
		Query query = new Query();
		query.addCriteria(Criteria.where("gender").is(gender));
		return mongoTemplate.find(query, User.class);
	}

	@Override
	public List<User> findUsersByAge(int age) {
		Query query = new Query();
		query.addCriteria(Criteria.where("age").is(age));
		return mongoTemplate.find(query, User.class);
	}

	@Override
	public List<User> findUsersByAgeInterval(int minimalAge, int maximalAge) {
		Query query = new Query();
		query.addCriteria(Criteria.where("age").gte(minimalAge).and("age").lte(maximalAge));
		return mongoTemplate.find(query, User.class);
	}

	@Override
	public List<User> findWhoSawMe(long _id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findWhoISaw(long _id) {
		// TODO Auto-generated method stub
		return null;
	}
}
