package com.wildcodeschool.scary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class ScaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScaryApplication.class, args);
	}
	
	
	@RequestMapping("/")
    @ResponseBody
	public String home() {
	
		
		return " ";
	}
  	

}
