package com.bloomtech.springboot.controller;


import com.bloomtech.springboot.model.theDataForRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class myControllers {

    @GetMapping(value="/")
    public String rootPathMethod(){
        System.out.println("Method for GET with path '/' was executed");
        return "Root path method was called";
    }


    @GetMapping(value="/startreck")
    public String anyNameYouWant(@RequestParam String whoTheyAre){
        System.out.println("Controller method for GET  with startreck was run");
        return "Star Trek method was called with parameter" + whoTheyAre;
    }

    @GetMapping(value="/startreck/Spock")
    public String anyNameYouWant2(){
        System.out.println("Controller method for GET  with startreck/Spock was run");
        return "Live long and prosper";
    }

    @PostMapping(value="/")
    public String wilberPost(@RequestBody theDataForRequest dattaPassedIn){
        System.out.println("Controller method for POST  with /");
        System.out.println("The data sent with the request was:" + dattaPassedIn);
        return "Mr Ed was talking on 1960";
    }
}
