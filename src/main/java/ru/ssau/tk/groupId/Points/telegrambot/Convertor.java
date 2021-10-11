package ru.ssau.tk.groupId.Points.telegrambot;

import lombok.SneakyThrows;
import org.checkerframework.checker.units.qual.C;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Convertor extends TelegramLongPollingBot {
    @Override
    @SneakyThrows
    public void onUpdateReceived(Update update) {
       try {
           if (update.hasMessage()) {
               Message messege = update.getMessage();
               execute(SendMessage.builder().chatId(messege.getChatId().toString()).text("Вы написали: \n" + messege.getText()).build());
           }
       }
       catch (TelegramApiException e)
       {
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
    public static void main(String[] args){
        Convertor bot = new Convertor();
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(bot);
        }
       catch (TelegramApiException e){
            e.printStackTrace();
       }
    }

}
