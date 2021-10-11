package ru.ssau.tk.groupId.Points.telegrambot;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.api.methods.send.SendAnimation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TestBot extends DefaultAbsSender {
    public TestBot(DefaultBotOptions options) {
        super(options);
    }

    @Override
    public String getBotToken() {
        return "2094032540:AAF2TIbb_8F18jMx7q9Ivuuopek1W9B-R84";
    }

    @SneakyThrows
    public static void main(String[] args) {
        TestBot bot = new TestBot(new DefaultBotOptions());
        try {
            bot.execute(SendMessage.builder().chatId("1082432833").text("hello, world <3").build());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        try {
            bot.execute(SendMessage.builder().chatId("1082432833").text("Вот так вот: В данном тестовом боте я попробую реализвать несколько достаточно интересных функцийю ").build());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
