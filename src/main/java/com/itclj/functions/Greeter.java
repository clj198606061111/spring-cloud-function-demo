package com.itclj.functions;

import org.springframework.cglib.core.internal.Function;
import org.springframework.stereotype.Component;

@Component
public class Greeter implements Function<String, String> {
    @Override
    public String apply(String s) {
        return "Hello " + s + ", and welcome to Spring Cloud Function!!!";
    }
}
