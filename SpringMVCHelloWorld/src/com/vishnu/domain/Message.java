package com.vishnu.domain;

import java.util.Date;

public class Message {
	
	long id;
	String name;
	String message;
	Date date;
	int trace;
	
	public int getTrace() {
		return trace;
	}
	public void setTrace(int trace) {
		this.trace = trace;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}
