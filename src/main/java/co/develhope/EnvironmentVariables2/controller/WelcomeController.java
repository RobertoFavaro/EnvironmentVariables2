package co.develhope.EnvironmentVariables2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v")
public class WelcomeController {

    @Value("${welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/welcome")
    public String welcome() {
        return welcomeMsg;
    }
}