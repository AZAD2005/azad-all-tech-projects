package com.ska;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCardClass {


    @Bean
    public DebitCard getCard(){
        return new DebitCard();
    }
}
