package ru.ssau.tk.groupId.Points.telegrambot;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class TestBot extends DefaultAbsSender {
    public TestBot(DefaultBotOptions options){
        super(options);
    }
    @Override
    public String getBotToken(){
        return "2094032540:AAF2TIbb_8F18jMx7q9Ivuuopek1W9B-R84";
    }
    @SneakyThrows
    public static void main(String [] args)
    {
        TestBot bot = new TestBot(new DefaultBotOptions());
        bot.execute(SendMessage.builder().chatId("1082432833").text("hello,world").build());
    }
}
