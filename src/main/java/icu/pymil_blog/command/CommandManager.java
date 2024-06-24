package icu.pymil_blog.command;

import icu.pymil_blog.user.User;

import java.util.ArrayList;

public class CommandManager {
    private final ArrayList<Command> commands = new ArrayList<>();

    /**
     * 添加一个command。
     * @param command Command
     * @return boolean
     */
    public boolean addCommand(Command command) {
        return commands.add(command);
    }

    /**
     * 删除指定的command。
     * @param command Command
     * @return boolean
     */
    public boolean removeCommand(Command command) {
        return commands.remove(command);
    }

    /**
     * 获取所有command的名称。
     * @return ArrayList<String>
     */
    public ArrayList<String> getAllCommandName() {
        ArrayList<String> result = new ArrayList<>();
        for (Command command: commands) {
            result.add(command.getCommandName());
        }
        return result;
    }
}
