package com.example.service;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.model.User;
import com.example.repository.UserRepository;

public class CustomerUserService implements UserDetailsService {
	@Autowired
	UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepo.findByEmail(email);
		if(user == null)
		{
			throw new UsernameNotFoundException("This user is not found");
		}
		return new org.springframework.security.core.userdetails.User
				(user.getEmail(), user.getPassword(), user.isActive(), true, true, true, null
				);		
	}

}
