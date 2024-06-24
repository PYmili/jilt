package icu.pymil_blog.command;

import icu.pymil_blog.user.User;

public class Command {
    private String commandName;
    private User.UserType authority;
    private String[] CommandValue;

    public Command() {
        setAuthority(User.UserType.ordinary);
    }

    public Command(String commandName) {
        setCommandName(commandName);
        setAuthority(User.UserType.ordinary);
    }

    public Command(String commandName, User.UserType authority) {
        setCommandName(commandName);
        setAuthority(authority);
    }

    // Get and set function.
    public String getCommandName() {
        return commandName;
    }
    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }
    public User.UserType getAuthority() {
        return authority;
    }
    public void setAuthority(User.UserType authority) {
        this.authority = authority;
    }
    public String[] getCommandValue() {
        return CommandValue;
    }
    public void setCommandValue(String[] commandValue) {
        CommandValue = commandValue;
    }
}
