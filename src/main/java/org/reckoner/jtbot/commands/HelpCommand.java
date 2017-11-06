package org.reckoner.jtbot.commands;

/**
 * Created by Andy on 07.11.2017.
 */

import org.telegram.telegrambots.api.objects.Chat;
import org.telegram.telegrambots.api.objects.User;
import org.telegram.telegrambots.bots.AbsSender;
import org.telegram.telegrambots.bots.commands.BotCommand;
import org.telegram.telegrambots.bots.commands.ICommandRegistry;

public class HelpCommand extends BotCommand {

    private final ICommandRegistry commandRegistry;
    public HelpCommand(ICommandRegistry iCommandRegistry){
        super("help", "some custom help stuff here");
        this.commandRegistry = iCommandRegistry;
    }


    public void execute(AbsSender absSender, User user, Chat chat, String[] strings) {
        
    }
}

