package at.halora.services.bot.commands;

import at.halora.services.bot.TelegramBot;

public class StartCommand extends BotCommand {
    public StartCommand(TelegramBot bot, Long userId, String command) {
        super(bot, userId, command);
    }

    @Override
    public void execute() {
        //TODO Check if user is already registered
        bot.sendBotMessage(userId, "Welcome! \uD83D\uDC4B \nBefore you can start using HaLoRa, you need to associate your Telegram Account with a HaLoRa username. Use /register <username> to begin.");
    }
}
