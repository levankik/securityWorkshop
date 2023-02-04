package controllers;

import org.springframework.web.bind.annotation.PostMapping;

public class HelloWorldController {
    @PostMapping( "/hello" )
    public String firstPage() {
        return "Hello World";
    }
}
