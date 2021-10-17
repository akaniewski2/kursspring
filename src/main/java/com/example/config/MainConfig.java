package com.example.config;

import com.example.kursspring.domain.repository.DBKnightRepository;
import com.example.kursspring.domain.repository.InMemoryKnightRepository;
import com.example.kursspring.domain.repository.KnightRepository;
import org.springframework.context.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;

@Configuration
//@ImportResource("classpath:config/castle-config.xml")
//@PropertySource("classpath:InMemoryKnightRepository.properties")
public class MainConfig {

    @Bean(name="inMemoryKnigthRepository")
//    @Primary
    @Profile("dev")
    public KnightRepository createInMemoryRepo() {
        KnightRepository repo = new InMemoryKnightRepository();
        return  repo;
    }


    @Bean(name="dbKnigthRepository")
    @Profile("prod")
    public KnightRepository createDbKnigthRepository() {
        KnightRepository repo = new DBKnightRepository();
        return  repo;
    }






}

//    @Value("${my.castle.name:Yellow InMemoryKnightRepository}")
//    String name;
//
//    @Bean
//    public Quest createQuest () {
//
//        return new Quest();
//    }
//        @Autowired
//        Quest quest;
//// dwa beany rycerza
//    @Bean(name="lancelot")
//    @Primary //przy tej notacji mozna usunac @Qualifier'y
//    public Knight lancelot(){ // createKnight - zla nazwa, bo pod nia tworzony jest bean, a ma byc knight
//        Knight lancelot=new Knight("Lancelot",26);
//        lancelot.setQuest(createQuest());
//        return lancelot;
//    }
//
//    @Bean(name="percival")
//    public Knight createKnightBean(){ // createKnight - zla nazwa, bo pod nia tworzony jest bean, a ma byc knight
//        Knight percival=new Knight("Percival",26);
//        percival.setQuest(createQuest());
//        return percival;
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
//    @Value("${my.castle.name:Yellow InMemoryKnightRepository}")
//    public InMemoryKnightRepository cqstle(String name){
//        InMemoryKnightRepository castle=new InMemoryKnightRepository(knight());
//        castle.setName(name);
//        return castle;
//    }

