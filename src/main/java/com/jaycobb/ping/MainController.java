package com.jaycobb.ping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private static final Logger log = LoggerFactory.getLogger(MainController.class);

    @GetMapping
    public String get() {
        log.info("hello");
        return "hello";
    }

    @GetMapping(value = "/{message}")
    public String get(@PathVariable(value = "message") final String message) {
        log.info("hello " + message);
        return "hello " + message;
    }
}
