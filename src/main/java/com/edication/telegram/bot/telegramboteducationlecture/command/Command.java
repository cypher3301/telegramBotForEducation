package com.edication.telegram.bot.telegramboteducationlecture.command;

import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Command interface for handling telegram-bot commands.
 */
public interface Command {

    /**
     * Main method, witch is executing command logic
     *
     * @param update provided {@link Update} object with all data, witch needed for command.
     */
    void execute(Update update);
}
