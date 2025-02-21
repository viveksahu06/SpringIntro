//Make REST Call to show Hello Mark
//        Taylor from BridgeLabz
//        - Use PUT Request Method and pass first name as
//        Path Variable and last name as Query Parameter
//        - Use CURL to demonstrate the REST API Call
//        - curl -X PUT
//        localhost:8080/hello/put/Mark/?lastName=Taylor
//        -w "\n"
package com.springintro.SpringIntro.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class UserController {

    @PutMapping("/put/{firstName}/")
    public String updateGreeting(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " "  + lastName + " from BridgeLabz";
    }

}
