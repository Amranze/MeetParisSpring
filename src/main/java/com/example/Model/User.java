package com.example.Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String name;
	private String lastname;
	private String username;
	private String mail;
	private String password;
	private Date birthdate;
	private int age;
	private String phone;
	//private Contact contact;
	private String adresse;
	private int postalCode;
	private String city;
	private String country;
	private long lastConnection;
	private boolean Active;
	private List<Conversation> conversations;
	private List<String> pictures;
	private List<String> likes;
	
	public User() {
		super();
	}

	public User(long id, String name, String lastname, String username, String mail, String password, Date birthdate,
			int age, String phone, String adresse, int postalCode, String city, String country, long lastConnection,
			boolean active, List<Conversation> conversations, List<String> pictures, List<String> likes) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.username = username;
		this.mail = mail;
		this.password = password;
		this.birthdate = birthdate;
		this.age = age;
		this.phone = phone;
		this.adresse = adresse;
		this.postalCode = postalCode;
		this.city = city;
		this.country = country;
		this.lastConnection = lastConnection;
		Active = active;
		this.conversations = conversations;
		this.pictures = pictures;
		this.likes = likes;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getLastConnection() {
		return lastConnection;
	}
	public void setLastConnection(long lastConnection) {
		this.lastConnection = lastConnection;
	}
	public boolean isActive() {
		return Active;
	}
	public void setActive(boolean active) {
		Active = active;
	}


	public List<Conversation> getConversations() {
		return conversations;
	}


	public void setConversations(List<Conversation> conversations) {
		this.conversations = conversations;
	}


	public List<String> getPictures() {
		return pictures;
	}



	public void setPictures(List<String> pictures) {
		this.pictures = pictures;
	}	
	public List<String> getLikes() {
		return likes;
	}



	public void setLikes(List<String> likes) {
		this.likes = likes;
	}

	
	
}
