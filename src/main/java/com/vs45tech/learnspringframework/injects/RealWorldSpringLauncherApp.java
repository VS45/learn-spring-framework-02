package com.vs45tech.learnspringframework.injects;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldSpringLauncherApp {
    
    public static void main(String[] args) {
        
        try(
            var context=new AnnotationConfigApplicationContext(RealWorldSpringLauncherApp.class);
        ){
var ans=context.getBean(BusinessCalculationService.class).findMax();
System.out.println(ans);
        }
    }
}
