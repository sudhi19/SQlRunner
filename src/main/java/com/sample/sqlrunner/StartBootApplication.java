package com.sample.sqlrunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;

@SpringBootApplication
public class StartBootApplication {
@Autowired
 LogUtil logUtil;
    @Autowired
    SQLUtils sqlUtils;
    // start everything
    public static void main(String[] args) {
        SpringApplication.run(StartBootApplication.class, args);

    }
@PostConstruct
    void initializeApp()
{
    logUtil.bindLogger();
    sqlUtils.loadDriver();
}
    // run this only on profile 'demo', avoid run this in test
//    @Profile("demo")
//    @Bean
//    CommandLineRunner initDatabase(BookRepository repository) {
//        return args -> {
//            repository.save(new Book("A Guide to the Bodhisattva Way of Life", "Santideva", new BigDecimal("15.41")));
//            repository.save(new Book("The Life-Changing Magic of Tidying Up", "Marie Kondo", new BigDecimal("9.69")));
//            repository.save(new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler", new BigDecimal("47.99")));
//        };
 //   }
}
