package com.edication.telegram.bot.telegramboteducationlecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.telegram.telegrambots.meta.ApiConstants;

@SpringBootApplication
public class TelegramBotEducationLectureApplication {

    public static void main(String[] args) {
        SpringApplication.run(TelegramBotEducationLectureApplication.class, args);
    }

}
