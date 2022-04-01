package com.mcjerz.aster;

import com.mcjerz.aster.entity.Product;
import com.mcjerz.aster.entity.User;
import com.mcjerz.aster.repository.ProductRepository;
import com.mcjerz.aster.repository.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Locale;
import java.util.stream.Stream;

@SpringBootApplication
public class App {

    public static final Logger log = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("Jamal", "Pandora", "Candace", "Turquoise", "Clayton").forEach(name -> {
                User user = new User(name, name.toLowerCase() + "@gmail.com");
                userRepository.save(user);
            });
            userRepository.findAll().forEach(System.out::println);
        };
}

}
