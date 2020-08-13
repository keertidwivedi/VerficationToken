package com.example.model;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class VerificationToken {

	private static final int VALIDITY_TIME = 4 * 60;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String token;

	@OneToOne(targetEntity = User.class)
	private User user;

	private Date expiryTime;
	
	
	 public VerificationToken() {
	        super();
	    }

	public VerificationToken(User user) {
		String token = generateRandomUniqueToken();

		this.token = token;
		this.user = user;
		this.expiryTime = calculateExpieryTime();
	}

	public void updateToken() {
		this.token = generateRandomUniqueToken();
		this.expiryTime = calculateExpieryTime();

	}

	private String generateRandomUniqueToken() {
		// TODO Auto-generated method stub
		return UUID.randomUUID().toString();
	}

	private Date calculateExpieryTime() {
		Calendar calendar = Calendar.getInstance();
		Date currentTimeAndDate = new Date();
		calendar.setTimeInMillis(currentTimeAndDate.getTime());
		calendar.add(Calendar.MINUTE, VALIDITY_TIME);

		return calendar.getTime();
	}

	public Date getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(Date expiryTime) {
		this.expiryTime = expiryTime;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public VerificationToken get() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	



}
