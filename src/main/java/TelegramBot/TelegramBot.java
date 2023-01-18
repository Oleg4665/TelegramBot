package TelegramBot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class TelegramBot extends TelegramLongPollingBot{

    @Override
    public String getBotUsername() {
        return "NewVisaTgBot";
    }

    @Override
    public String getBotToken() {
        return "5809917431:AAH3YtGVlpwnyiAclekr6hQoXPXwD37XZ4g";
    }

    @Override
    public void onUpdateReceived(Update update) {
        Message m = update.getMessage();
        String chatId = m.getChatId().toString();
        System.err.println(chatId);
    }
}