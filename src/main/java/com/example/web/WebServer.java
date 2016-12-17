package com.example.web;

import java.util.concurrent.Callable;

import com.cloudant.client.api.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServer {

	@Autowired
	Database mydb;

	@RequestMapping("/")
	public String index() {
		return "pong!";
	}

	@RequestMapping("/save")
	public String saver() {
		mydb.save(new Pet("myPet"));
		return "saved";
	}

	@RequestMapping(value = "/echo")
	public Callable<ResponseEntity<String>> echo(@RequestParam(value = "message", required = true) String message) {
		return () -> {
			return new ResponseEntity<>(message, HttpStatus.OK);
		};
	}

}
