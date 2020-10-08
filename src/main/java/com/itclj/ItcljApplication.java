package com.itclj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.internal.Function;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class ItcljApplication {
    public static void main(String[] args) {
        SpringApplication.run(ItcljApplication.class,args);
    }


    /**
     * 测试请求失败
     * @return
     */
    @Bean
    public Function<Flux<String>, Flux<Integer>> add() {
        return flux -> flux.map(value -> Integer.parseInt(value) + 10);
    }

    /**
     * 测试请求失败
     * @return
     */
    @Bean
    public Function<String, String> uppercase() {
        return value -> value.toUpperCase();
    }

}
