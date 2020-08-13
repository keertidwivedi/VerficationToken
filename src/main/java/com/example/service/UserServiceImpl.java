package com.example.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dto.UserDto;
import com.example.event.SucessfullRegsEvent;
import com.example.model.User;
import com.example.model.VerificationToken;
import com.example.repository.UserRepository;
import com.example.repository.VerificationTokenRepo;
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	VerificationTokenRepo verificationTokenRepo;
	
	@Autowired
	ApplicationEventPublisher eventPublisher;
	 
	
	
	
	
	@Override
	public User registerUser(UserDto userDto) {
		if(userRepository.findByEmail(userDto.getEmail()) != null)
		{
			System.out.println("Hello");
		}
		User user = new User();
		user.setEmail(userDto.getEmail());
		user.setFullName(userDto.getFullname());
		user.setActive(false);
		user.setPassword(userDto.getPassword());
		User savedUser = userRepository.save(user);
		
		
		eventPublisher.publishEvent(new SucessfullRegsEvent(savedUser));
		
		return savedUser;
	}

	@Override
	public User validateUser(String token)
	
	{
		VerificationToken verficationToken = verificationTokenRepo.findByToken(token);
		if(verficationToken == null)
		{
			return null;
		}
		if(verficationToken.getExpiryTime().getTime() - new Date().getTime() > 0)
		{
			User verifiedUser	= verficationToken.getUser();
			verifiedUser.setActive(true);
			userRepository.save(verifiedUser);
			verificationTokenRepo.delete(verficationToken.get());
			return verifiedUser; 
		}else
		{
		return null;
		
	}

	}
}
	
	

	
	
	

