package com.example.demoapi;

public class Message {
	
	private String text;
	private String status;
	
	public Message(String text, String status)
	{
		this.text=text;
		this.status=status;
	}
	
	public String getText()
	{
		return text;
	}
	
	public String getStatus()
	{
		
		return status;
		
	}

}
