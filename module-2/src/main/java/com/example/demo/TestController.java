/*
 * Copyright (c) 2019. by Seung-ha EOM
 */

package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value = "/hello")
	public ResponseEntity<String> hello() {

		try {
			return new ResponseEntity<>("hello", HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>("ERROR.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/hello2")
	public ResponseEntity<String> hello2() {

		try {
			return new ResponseEntity<>("hello", HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>("ERROR.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/hello3")
	public ResponseEntity<String> hello3() {

		try {
			return new ResponseEntity<>("hello", HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>("ERROR.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
