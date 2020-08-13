package com.example.event.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.example.event.SucessfullRegsEvent;
import com.example.model.User;
import com.example.model.VerificationToken;
import com.example.repository.VerificationTokenRepo;


@Component
public class SuccessfullRegisterEventListener implements ApplicationListener<SucessfullRegsEvent>{
	@Autowired
	VerificationTokenRepo verificationTokenRepo;
	
	@Override
	public void onApplicationEvent(SucessfullRegsEvent sucessullRegsEvent) {
		
		User registeredUser = sucessullRegsEvent.getRegisteredUser();
		
		VerificationToken token = new VerificationToken(registeredUser);
		
		verificationTokenRepo.save(token);
		
		
		
		
		
	}

}
