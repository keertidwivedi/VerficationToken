package com.example.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
	@NotEmpty
	@Size(min=5)
	private String fullname;
	@NotEmpty
	@Size(min=5)
	private String email;
	@NotEmpty
	@Size(min=5)
	private String password;
	
	
	
	
	public UserDto(@NotEmpty @Size(min = 5) String fullname, @NotEmpty @Size(min = 5) String email,
			@NotEmpty @Size(min = 5) String password) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.password = password;
	}




	public String getFullname() {
		return fullname;
	}




	public void setFullname(String fullname) {
		this.fullname = fullname;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	




	
	
	

}
