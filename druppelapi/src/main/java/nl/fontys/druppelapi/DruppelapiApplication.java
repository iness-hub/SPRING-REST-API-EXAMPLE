package nl.fontys.druppelapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication (scanBasePackages={"nl.fontys.druppelapi"})
@ComponentScan(basePackages ={"nl.fontys.druppelapi.controller","nl.fontys.druppelapi.service","nl.fontys.druppelapi.model","nl.fontys.druppelapi.repository"})


public class DruppelapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DruppelapiApplication.class, args);
    }

}
