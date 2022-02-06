package com.example.demo.exceptions;

public class ErrorObject {

	private Integer statusCode;
	private String message;	
	private Long timestamp;
	
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "ErrorObject [statusCode=" + statusCode + ", message=" + message + ", timestamp=" + timestamp + "]";
	}
	
	
}
