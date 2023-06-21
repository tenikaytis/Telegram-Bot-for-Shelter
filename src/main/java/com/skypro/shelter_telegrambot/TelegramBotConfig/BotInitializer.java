package com.skypro.shelter_telegrambot.TelegramBotConfig;

import com.skypro.shelter_telegrambot.service.TelegramBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
/**
 * Класс BotInitializer используется для инициализации и регистрации ботов в системе.
 */
@Component
public class BotInitializer {
    @Autowired
    TelegramBot telegramBot;
    /**
     * Метод init вызывается при получении события ContextRefreshedEvent и регистрирует ботов в системе.
     *
     * @throws TelegramApiException если при регистрации ботов произошла ошибка.
     */
    @EventListener ({ContextRefreshedEvent.class})
    public void init () throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        try {
            telegramBotsApi.registerBot(telegramBot);
        }
           catch (TelegramApiException e) {
        }
    }
}
