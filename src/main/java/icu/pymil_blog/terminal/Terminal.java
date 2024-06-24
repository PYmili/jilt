package icu.pymil_blog.terminal;

import icu.pymil_blog.command.Command;
import icu.pymil_blog.command.CommandManager;
import icu.pymil_blog.user.User;

import javax.swing.*;

public class Terminal {
    private User currentUser;
    private String currentCatalog;
    private final CommandManager commandMangaer = new CommandManager();

    public Terminal(User courrntUser) {
        setCurrentUser(courrntUser);
        setCurrentCatalog("~");
    }
    public Terminal(User courrntUser, String currntCatalog) {
        setCurrentUser(courrntUser);
        setCurrentCatalog(currntCatalog);
    }

    // Get and set function.
    public User getCurrentUser() {
        return currentUser;
    }
    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    public String getCurrentCatalog() {
        return currentCatalog;
    }
    public void setCurrentCatalog(String currentCatalog) {
        this.currentCatalog = currentCatalog;
    }

    public void info() {
        System.out.printf(currentUser.getUserName() + "@jilt:" + currentCatalog + "$ ");
    }

    private Command commandParser(String commandString) {
        String[] splitString = commandString.split("\\s+");
        Command result = new Command();
        result.setCommandName(splitString[0]);
        String[] commandValue = new String[]{};
        int copyLength = splitString.length - 1;
        if (splitString.length == 2) copyLength = 0;
        System.arraycopy(splitString, 1, commandValue, 0, copyLength);
        result.setCommandValue(commandValue);
        return result;
    }

    public String input(String command) {
        Command parserResult = commandParser(command);
        String switchReuslt = switch (parserResult.getCommandName()) {
            case "su" -> "input su command!";
            default -> parserResult.getCommandName() + ": command not found";
        };
        return switchReuslt;
    }
}
