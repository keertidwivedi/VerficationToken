package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ResponseDto;
import com.example.dto.UserDto;
import com.example.dto.UserResponseDto;
import com.example.model.User;

import com.example.service.UserService;

import lombok.Getter;
import lombok.Setter;

@RestController

public class RegistrationController {
	
	@Autowired
	private UserService userService;
	
	
	
	
	@PostMapping("/user/register")
	public  ResponseDto<UserResponseDto> registerUser(@RequestBody UserDto userDto)
	{
		User user = userService.registerUser(userDto);
		
		return new ResponseDto<UserResponseDto>
		(HttpStatus.OK, new UserResponseDto(user.getId(), user.getFullName(),user.getEmail(),user.isActive()));
				
				
				
		
	}

}
