package com.vijay.websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.websocket.models.Message;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class MessaegController {
	
	
	@MessageMapping("/message")
	@SendTo("/topic/return-to")
	public Message getContext(@RequestBody Message msg) {
		
		try {
			
			Thread.sleep(1000);
			
		} catch (InterruptedException IE) {
			// TODO: handle exception
			IE.printStackTrace();
		}
		
		return msg;
	}

}
