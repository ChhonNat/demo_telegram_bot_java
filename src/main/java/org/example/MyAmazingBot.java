package org.example;

import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramClient;

public class MyAmazingBot implements LongPollingSingleThreadUpdateConsumer {
    private TelegramClient telegramClient = new OkHttpTelegramClient("8150838466:AAEQPrbADRTlhfiakI_kfKVdnHFULQCPPLw");

//    @Override
//    public void consume(Update update) {
//        // We check if the update has a message and the message has text
//        if (update.hasMessage() && update.getMessage().hasText()) {
//            // Create your send message object
//            SendMessage sendMessage = new SendMessage(update.getMessage().getChatId().toString(), "Hell world from application java");
//            try {
//                // Execute it
//                telegramClient.execute(sendMessage);
//            } catch (TelegramApiException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    @Override
    public void consume(Update update) {
        System.out.println("Update received: " + update); // Log every update
        if (update.hasMessage() && update.getMessage().hasText()) {
            System.out.println("Processing message: " + update.getMessage().getText());
            SendMessage sendMessage = new SendMessage(update.getMessage().getChatId().toString(),  update.getMessage().getText());
            try {
                telegramClient.execute(sendMessage);
                System.out.println("Message sent: Hello world");
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }


}
