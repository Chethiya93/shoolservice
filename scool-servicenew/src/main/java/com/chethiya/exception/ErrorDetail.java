package com.chethiya.exception;

import java.util.Date;

public class ErrorDetail {
	private String Message;
	private String detail;
	private Date timeStamp;

	public ErrorDetail(String message, String detail, Date timeStamp) {
		super();
		this.Message = message;
		this.detail = detail;
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		this.Message = message;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
