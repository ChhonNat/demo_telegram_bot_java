package org.example;

import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            String botToken = "8150838466:AAEQPrbADRTlhfiakI_kfKVdnHFULQCPPLw";
            TelegramBotsLongPollingApplication botsApplication = new TelegramBotsLongPollingApplication();
            botsApplication.registerBot(botToken, new MyAmazingBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}