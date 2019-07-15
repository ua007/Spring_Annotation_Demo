package com.stackroute;

import com.stackroute.Domain.Config;
import com.stackroute.Domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Movie movie=(Movie) context.getBean("movie",Movie.class);

        context.registerShutdownHook();
        
    }
}
