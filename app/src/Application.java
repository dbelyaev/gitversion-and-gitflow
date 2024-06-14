package com.dbelyaev.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * The main class for the Application.
 */
@SpringBootApplication
public class Application {

    /**
     * The main method for the Application.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
