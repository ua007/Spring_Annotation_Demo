package com.stackroute.Domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Actor actor()
    {
        return new Actor("Utkarsh","Male",22);
    }

    @Bean
    public Actor actor1()
    {
        return new Actor("Aditya","Male",21);
    }

    @Bean
    public Actor actor2()
    {
        return new Actor("Aman","Male",23);
    }

//    @Bean
//    public Actor actor1()
//    {
//        Actor actor=new Actor();
//        actor.setName("Aditya");
//        actor.setGender("Male");
//        actor.setAge(21);
//        return actor;
//    }

    @Bean
    public Movie movie()
    {
        return new Movie(actor());
    }

}
