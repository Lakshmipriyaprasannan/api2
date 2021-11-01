package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.schema.UserResponse;

@Service
public class UserServiceImpl implements UserService{
	private static final String SUCCESS = "SUCCESS";
	private static final String FAILED = "FAILED";
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserResponse getUserById(Long userId) {
		return this.getResponse(SUCCESS,"user details get by Id", userRepo.findById(userId).get());
	}
	
	@Override
	public UserResponse addUser(User user) {
		try {
			return this.getResponse(SUCCESS,"add to the user",userRepo.save(user));
		}catch (Exception e) {
			return this.getResponse(FAILED, "Email Id Already present",null);
			}
	}

	@Override
	public UserResponse updateUser(User user) {
		
		Optional<User> optUserById = userRepo.findById(user.getUserId());
		System.out.println(optUserById.get().toString());
		if (optUserById.isPresent()) {
			try {
				User getusers=optUserById.get();
				getusers.setName(user.getName());
				getusers.setDob(user.getDob());
				getusers.setEmail(user.getEmail());
				getusers.setMobile(user.getMobile());
				return this.getResponse(SUCCESS,"update successfully", userRepo.save(getusers));
			} catch (Exception e) {
				return this.getResponse(FAILED, "Email Id Already present",null);
			}
		}
		return this.getResponse(FAILED, "user is not exist..",null);
	}
	
	@Override
	public UserResponse deleteUser(Long userId) {
		userRepo.deleteById(userId);
		return this.getResponse(SUCCESS," delete successfully...", null);
	}

	private UserResponse getResponse(String responseType, String responseMessage,User user) {
		UserResponse response = new UserResponse();
		response.setResponseType(responseType);
		response.setResponseMessage(responseMessage);
		response.setUser(user);
		return response;
	}	
}
