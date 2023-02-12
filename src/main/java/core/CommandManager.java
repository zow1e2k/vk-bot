package core;

import core.commands.*;

import java.util.HashSet;

public class CommandManager {
    private static HashSet<Command> commands = new HashSet<>();

    static {
        commands.add(new Start("Начать"));
        commands.add(new Start("Start"));
        commands.add(new Help("Помощь"));
    }

    public static HashSet<Command> getCommands(){
        return commands;
    }
    public static void addCommand(Command command) { commands.add(command);}
    public static void deleteCommand(Command command) { commands.remove(command); }
    public static void setCommandType(String name, String type) {
        for (Command command : commands)
            if (command.name.equals(name)) command.type = type;
    }
    public static void setCommandPlatform(String name, String platform) {
        for (Command command : commands)
            if (command.name.equals(name)) command.platform = platform;
    }
    public static boolean isExist(String name){
        for (Command command : commands)
            if (command.name.equals(name)) return true;
        return false;
    }
    public static void deleteCommandById(String id){
        for (Command command : commands)
            if (command.name.equals(id)) deleteCommand(command);
    }
}
