package com.skypro.shelter_telegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Главный класс приложения, запускающий Spring Boot приложение.
 */
@EnableScheduling
@SpringBootApplication
public class ShelterTelegramBotApplication {
    /**
     * Главный метод, который запускает приложение.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        SpringApplication.run(ShelterTelegramBotApplication.class, args);
    }
}
