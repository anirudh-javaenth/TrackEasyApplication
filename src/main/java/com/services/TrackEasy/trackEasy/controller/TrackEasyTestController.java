package com.services.TrackEasy.trackEasy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/demo")
public class TrackEasyTestController {
    @PostMapping(value = "/test")
    @ResponseStatus(HttpStatus.OK)
    public String testAPI(@RequestHeader(value = "LOGGED_IN_USER", required = true) String loggedInUser){
        return "I am inside TestAPI Hello";
    }
}
