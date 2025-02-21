//Make REST Call to show Hello
//        Mark from BridgeLabz
//        - Use GET Request Method and pass name as
//        path variable
//        - Use CURL to demonstrate the REST API Call
//        - curl localhost:8080/hello/param/Mark -w
//        "\n"
package com.springintro.SpringIntro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class UserController {

    //method to return hello from
    @GetMapping("/param/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello " + name + " from BridgeLabz";
    }
}
