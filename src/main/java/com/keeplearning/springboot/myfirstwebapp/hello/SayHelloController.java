package com.keeplearning.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	@RequestMapping ("say-hello")
	@ResponseBody
	public String Sayhello() {
		return "Hey! what are doing today";
		
	}
}
