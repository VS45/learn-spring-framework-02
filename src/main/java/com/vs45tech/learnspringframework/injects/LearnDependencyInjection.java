package com.vs45tech.learnspringframework.injects;

import java.util.Arrays;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
class YourBusiness{
  
  Dependency1 dependency1;

  Dependency2 dependency2; 


  public YourBusiness(Dependency1 dependency1, Dependency2 dependency2) {
    super();
    System.out.println("Dependency one and Two");
    this.dependency1 = dependency1;
    this.dependency2 = dependency2;
  }

  public String toString(){
    return "Using "+dependency1+" and "+dependency2;
  } 
}
@Component
class Dependency1{

}
@Component
class Dependency2{

}

@Configuration
@ComponentScan // package to check for beans and this case it should be the package that this same class is located since the package is not indicated
public class LearnDependencyInjection {
    public static void main(String[] args) {
        try(
            var context=new AnnotationConfigApplicationContext(LearnDependencyInjection.class)
        ){
Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
System.out.println(context.getBean(YourBusiness.class));
        }
    }
}
