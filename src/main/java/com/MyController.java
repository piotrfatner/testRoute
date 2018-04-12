package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting() {
        return "hello vehas!";
    }
}
