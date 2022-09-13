package com.itsecasia.opensearchdashboard.alert;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kong.unirest.Unirest;

@RestController
@RequestMapping("/")
public class SendToTelegramController {
	
	@Value( "${telegram.id}" )
	private String telegramId;
	
	@Value( "${telegram.bot}" )
	private String telegramBot;

	@PostMapping("/")
	public ResponseEntity<?> home(@RequestBody String request) {
		
		
		String urlTelegram="https://api.telegram.org/bot"+telegramBot+"/sendMessage";

		Unirest.get(urlTelegram)
		.queryString("chat_id", telegramId)
		.queryString("text",request).asString().getBody();
		
		return ResponseEntity.ok("ok");
		
	}
}
