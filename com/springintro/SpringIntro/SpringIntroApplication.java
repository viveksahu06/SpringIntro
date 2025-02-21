//Create a Rest Controller to demonstrate
//		the various HTTP Methods and respond
//		hello messages to the User. To begin
//		with show Hello from BridgeLabz
//		- Use GET Request Method
//		- Use CURL to demonstrate the REST API Call
//		- curl localhost:8080/hello -w "\n"
package com.springintro.SpringIntro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntroApplication.class, args);
	}

}
