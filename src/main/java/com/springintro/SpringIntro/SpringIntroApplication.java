//Make REST Call to show Hello
//		Mark from BridgeLabz
//		- Use GET Request Method and pass name as
//		query parameter
//		- Use CURL to demonstrate the REST API Call
//		- curl localhost:8080/hello/query?name=Mark
//		-w "\n"
package com.springintro.SpringIntro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntroApplication.class, args);
	}

}
