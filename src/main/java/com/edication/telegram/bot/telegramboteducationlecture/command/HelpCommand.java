package com.edication.telegram.bot.telegramboteducationlecture.command;

import com.edication.telegram.bot.telegramboteducationlecture.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

import static com.edication.telegram.bot.telegramboteducationlecture.command.CommandName.*;

/**
 * Stop {@link Command}.
 */
public class HelpCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    private final static String HELP_MESSAGE = String.format("✨<b>Доступные команды</b>✨\n\n"
            + "<b>Начать\\закончить роботу с ботом</b>\n"
            + "%s - начать роботу со мной\n"
            + "%s - приостановить роботу со мной\n"
            + "%s - получить помощь в роботе со мной\n",
            START.getCommandName(),
            STOP.getCommandName(),
            HELP.getCommandName()
            );



    public HelpCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }


    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), HELP_MESSAGE);
    }
}
