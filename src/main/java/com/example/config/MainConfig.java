package com.example.config;

import com.example.kursspring.domain.Castle;
import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.Quest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
//@ImportResource("classpath:config/castle-config.xml")
//@PropertySource("classpath:castle.properties")
public class MainConfig {

//    @Value("${my.castle.name:Yellow Castle}")
//    String name;

//    @Bean
//    public Quest createQuest () {
//
//        return new Quest();
//    }
//
//    @Bean
//    @Scope("prototype")
//    public Knight knight(){ // createKnight - zla nazwa, bo pod nia tworzony jest bean, a ma byc knight
//        Knight knight=new Knight("Lancelot",26);
//        knight.setQuest(createQuest());
//        return knight;
//    }
//
//    @Bean(name="zamek" ,initMethod = "build",destroyMethod = "tearDown")
//    @Value("${my.castle.name:Yellow Castle}")
//    public Castle cqstle(String name){
//        Castle castle=new Castle(knight());
//        castle.setName(name);
//        return castle;
//    }
}
