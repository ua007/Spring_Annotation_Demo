package com.stackroute.Domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Actor actor()
    {
        Actor actor=new Actor();
        actor.setName("Utkarsh");
        actor.setGender("Male");
        actor.setAge(22);
        return actor;
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
        Movie movie=new Movie();
        movie.setActor(actor());

        return movie;
    }

}
