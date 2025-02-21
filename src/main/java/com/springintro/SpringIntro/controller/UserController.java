//Make REST Call to show Hello
//        Mark from BridgeLabz
//        - Use GET Request Method and pass name as
//        query parameter
//        - Use CURL to demonstrate the REST API Call
//        - curl localhost:8080/hello/query?name=Mark
//        -w "\n"
package com.springintro.SpringIntro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }
    //method to return hello from
    @GetMapping("/hello/query")
    public String sayHello(@RequestParam String name){
        return "Hello "+ name +" " + "from BridgeLabz";
    }


}
