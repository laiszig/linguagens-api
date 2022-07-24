package br.com.alura.linguagensapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EnableMongoRepositories(basePackageClasses = LinguagemRepository.class)
public class LinguagensApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinguagensApiApplication.class, args);
    }

}
