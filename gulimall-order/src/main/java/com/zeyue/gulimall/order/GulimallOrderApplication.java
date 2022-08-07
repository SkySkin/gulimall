package com.zeyue.gulimall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GulimallOrderApplication {


	@RequestMapping("/hello")
	public String show() {

		return "hello world";
	}


	public static void main(String[] args) {
		SpringApplication.run(GulimallOrderApplication.class, args);
	}

}
