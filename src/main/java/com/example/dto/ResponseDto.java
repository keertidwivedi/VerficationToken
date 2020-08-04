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

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	

}
