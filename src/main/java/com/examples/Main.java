package com.examples;

import com.examples.knights.Knight;
import com.examples.services.KnightServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext contextAnnotation = new AnnotationConfigApplicationContext(AppConfig.class);
        Knight knightAnnotation = (Knight) contextAnnotation.getBean("knight");
        KnightServices knightServices = (KnightServices) contextAnnotation.getBean("knightServices");
        knightAnnotation.embarkOnQuest();
    }
}