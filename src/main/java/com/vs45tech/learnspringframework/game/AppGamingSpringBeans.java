package com.vs45tech.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.vs45tech.learnspringframework.game")
public class AppGamingSpringBeans {
 
    public static void main(String[] args) {
       
        try(var context=new AnnotationConfigApplicationContext(AppGamingSpringBeans.class)){
context.getBean(GamingConsole.class).up();
context.getBean(GameRunner.class).run();
        }
    }
}
