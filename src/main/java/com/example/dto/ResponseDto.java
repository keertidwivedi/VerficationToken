package com.example.dto;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDto<T> {
	private T data;
	
	private HttpStatus httpStatus;

	public ResponseDto(HttpStatus httpStatuseDto, T data) {
	 
		this.data = data;
		this.httpStatus = httpStatuseDto;
	}

	
	
	

}
