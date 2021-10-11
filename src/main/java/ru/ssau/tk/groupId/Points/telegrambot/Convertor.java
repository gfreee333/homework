package ru.ssau.tk.groupId.Points.telegrambot;

import lombok.SneakyThrows;
import org.checkerframework.checker.units.qual.C;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.Optional;

public class Convertor extends TelegramLongPollingBot {
    @Override
    @SneakyThrows
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            handleMassage(update.getMessage());
        }
    }


    @SneakyThrows
    private void handleMassage(Message message) {
        try {
            if (message.hasText() && message.hasEntities()) {
                Optional<MessageEntity> commandEntity =
                        message.getEntities().stream().filter(e -> "bot_command".equals(e.getType())).findFirst();

                if (commandEntity.isPresent()) {
                    String command = message.getText().substring(commandEntity.get().getOffset(), commandEntity.get().getLength());
                    switch (command) {
                        case "/set_currency":
                            execute(SendMessage.builder().text("введите валюту для переводу в другую").chatId(message.getChatId().toString()).build());
                            return;
                    }
                }
            }
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "@SsauGfree333TestBot";
    }

    @Override
    public String getBotToken() {
        return "2094032540:AAF2TIbb_8F18jMx7q9Ivuuopek1W9B-R84";
    }

    @SneakyThrows
    public static void main(String[] args) {
        Convertor bot = new Convertor();
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(bot);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

}
