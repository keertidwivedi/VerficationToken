package com.example.dto;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {
	
	private Long id;
	private String fullName;
	private String email;
	private boolean active;
	public UserResponseDto(Long id, String fullName, String email, boolean active) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.active = active;
	}
	
	
	
	

}
