package com.nobelsoft.rest;

import com.nobelsoft.model.ReverseModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

@RestController
@Slf4j
public class TestRestService {

    @GetMapping("/authentication")
    public List<String> authentication() {
        log.info("Receiving Request");
        List<String> credentials = Arrays.asList("JRArmenta", "Armenta92");
        return credentials;
    }

    @GetMapping("/add/{num1}/{num2}")
    public double addingNumbers(@PathVariable double num1, @PathVariable double num2) {
        log.info("add :" + num1 + " + " + num2);
        return num1 + num2;
    }

    @PostMapping("/reverse")
    public String reverse(@RequestBody ReverseModel input) {
        return new StringBuffer(input.getInput()).reverse().toString();
    }

}
