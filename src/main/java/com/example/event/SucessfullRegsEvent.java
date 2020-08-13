package com.example.event;

import org.springframework.context.ApplicationEvent;

import com.example.model.User;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SucessfullRegsEvent extends ApplicationEvent {
	
	
	private User registeredUser;
	

	public SucessfullRegsEvent(User registeredUser) {
		super(registeredUser);
		// TODO Auto-generated constructor stub
		this.registeredUser=registeredUser; 
	}


	public User getRegisteredUser() {
		return registeredUser;
	}


	public void setRegisteredUser(User registeredUser) {
		this.registeredUser = registeredUser;
	}


	


}
