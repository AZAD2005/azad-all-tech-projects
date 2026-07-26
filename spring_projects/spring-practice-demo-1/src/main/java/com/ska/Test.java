package com.ska;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.ska");
        context.refresh();

        DebitCard bean = context.getBean(DebitCard.class);
        bean.welcomeMessage();
    }
}
