package com.ska.annotations;

import com.ska.annotations.SbiCreditCard;
import com.ska.annotations.SbiCreditCardConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class App{


	public static void main(String[] args) {

     ApplicationContext ctx = new AnnotationConfigApplicationContext(SbiCreditCardConfig.class);

        SbiCreditCard creditCard = ctx.getBean(SbiCreditCard.class);
        creditCard.discount();
        creditCard.limit();
        creditCard.dueAmount();


    }


}

