package com.vs45tech.learnspringframework.lazyloading;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{

}
@Component
@Lazy
class ClassB{
  ClassA classA;

    public ClassB(ClassA classA){
        System.out.println("Some Initialization Logic");
        this.classA=classA;
    }
    public void doSomething(){
        System.out.println("Do Something here...");
    }
}
@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
     public static void main(String[] args) {
        
        try(
            var context=new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class);
        ){
var ans=context.getBeanDefinitionNames();
Arrays.stream(ans).forEach(System.out::println);
System.out.println("Initialization of Context Completed");
context.getBean(ClassB.class).doSomething();

        }
    }
}
