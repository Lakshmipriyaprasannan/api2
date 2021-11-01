package com.example.service;

import com.example.model.User;
import com.example.schema.UserResponse;

public interface UserService {
	
	UserResponse addUser(User user);

	UserResponse getUserById(Long userId);

	UserResponse deleteUser(Long userId);

	UserResponse updateUser(User user);


}
