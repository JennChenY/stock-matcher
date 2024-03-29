package com.flow.stockmatcher.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<String> newGame() {
        return ResponseEntity.ok("hello world");
    }
}
