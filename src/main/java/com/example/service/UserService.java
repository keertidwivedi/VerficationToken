package com.example.service;





import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dto.UserDto;
import com.example.dto.UserResponseDto;
import com.example.model.User;




public interface UserService {

	User registerUser(UserDto userDto);

}
