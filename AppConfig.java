package com.qa.starterproject;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class AppConfig {
	
	
    @Bean
    public LocalTime localTime() {
        return LocalTime.now();
    }

}
