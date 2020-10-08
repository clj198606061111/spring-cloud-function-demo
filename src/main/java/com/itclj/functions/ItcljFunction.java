package com.itclj.functions;

import org.springframework.cglib.core.internal.Function;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;


@Configuration
public class ItcljFunction {

    @Bean
    public Function<Flux<String>, Flux<Integer>> add() {
        return flux -> flux.map(value -> Integer.parseInt(value) + 10);
    }
}
