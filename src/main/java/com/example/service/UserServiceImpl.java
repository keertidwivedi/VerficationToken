package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dto.UserDto;
import com.example.model.User;

import com.example.repository.UserRepository;
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepository userRepository;
	
	
	 // @Autowired public PasswordEncoder pass = new BCryptPasswordEncoder(12) ;
	 
	
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
		
		return savedUser;
	}

}
