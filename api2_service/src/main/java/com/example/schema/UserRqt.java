package com.example.schema;

import java.sql.Date;

public class UserRqt {
	
	public UserRqt() {
		// TODO Auto-generated constructor stub
	}
	private long rqtuserId;
	private String rqtname;
	private Date rqtdob;
	private String rqtemail;
	private String rqtmobile;
	
	public long getRqtuserId() {
		return rqtuserId;
	}
	public void setRqtuserId(long rqtuserId) {
		this.rqtuserId = rqtuserId;
	}
	public String getRqtname() {
		return rqtname;
	}
	public void setRqtname(String rqtname) {
		this.rqtname = rqtname;
	}
	public Date getRqtdob() {
		return rqtdob;
	}
	public void setRqtdob(Date rqtdob) {
		this.rqtdob = rqtdob;
	}
	public String getRqtemail() {
		return rqtemail;
	}
	public void setRqtemail(String rqtemail) {
		this.rqtemail = rqtemail;
	}
	public String getRqtmobile() {
		return rqtmobile;
	}
	public void setRqtmobile(String rqtmobile) {
		this.rqtmobile = rqtmobile;
	}
	@Override
	public String toString() {
		return "UserRqt [rqtuserId=" + rqtuserId + ", rqtname=" + rqtname + ", rqtdob=" + rqtdob + ", rqtemail="
				+ rqtemail + ", rqtmobile=" + rqtmobile + "]";
	}

}
