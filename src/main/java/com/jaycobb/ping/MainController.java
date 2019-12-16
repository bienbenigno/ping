package com.jaycobb.ping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private static final Logger log = LoggerFactory.getLogger(MainController.class);

    @GetMapping
    public String get() {
        log.info("MainController hello");
        return "hello";
    }
}
