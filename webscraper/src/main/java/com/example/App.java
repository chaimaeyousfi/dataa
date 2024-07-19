package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        if (args.length == 0) {
            // Start the Spring Boot application if no arguments are provided
            SpringApplication.run(App.class, args);
        } else {
            // Handle 'producer' or 'consumer' arguments
            String mode = args[0].toLowerCase();
            switch (mode) {
                case "producer":
                    runProducer();
                    break;
                case "consumer":
                    runConsumer();
                    break;
                default:
                    System.out.println("Invalid argument. Use 'producer' or 'consumer'.");
                    break;
            }
        }
    }

    private static void runProducer() {
        try {
            KafkaProducerExample.main(new String[] {});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void runConsumer() {
        try {
            KafkaConsumerToFile.main(new String[] {});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
