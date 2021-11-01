package com.example.schema;

import com.example.model.User;

public class UserResponse {
	

	private String responseType;
	private String responseMessage;
	private User user;
	
	public String getResponseType() {
		return responseType;
	}

	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserResponse [responseType=" + responseType + ", responseMessage=" + responseMessage + ", user=" + user
				+ "]";
	}
	

}
