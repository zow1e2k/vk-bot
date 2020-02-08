package core;

import core.commands.*;
import sun.security.krb5.internal.crypto.Des;

import java.util.HashSet;

public class CommandManager {
    private static HashSet<Command> commands = new HashSet<>();

    static {
        commands.add(new Start("Начать"));
        commands.add(new Start("Start"));
        commands.add(new SAMP("SAMP"));
        commands.add(new Start("Назад"));
        commands.add(new CRMP("CRMP"));
        commands.add(new RageMP("RAGE MP"));
        commands.add(new Introduce("Внедрение систем"));
        commands.add(new CreateMode("Создание игрового мода"));
        commands.add(new FixBug("Исправление ошибок"));
        commands.add(new ShowCommands("show"));
        commands.add(new Order("Сделать заказ"));
        commands.add(new License("Соглашение"));
        commands.add(new Price("Прайс-лист"));
        commands.add(new Scripting("Скриптинг"));
        commands.add(new FullMap("Маппинг с нуля"));
        commands.add(new IntroduceMap("Внедрение маппинга"));
        commands.add(new Map("Маппинг"));
        commands.add(new SAMPMap("SAMP/CRMP"));
        commands.add(new RageMap("RAGEMP"));
        commands.add(new Web("Web-разработка"));
        commands.add(new StandartWeb("Стандарт клиент-сервер"));
        commands.add(new SPAWeb("Single Page Application"));
        commands.add(new CreatePage("Создание сайта"));
        commands.add(new FixPage("Исправление веб-ошибок"));
        commands.add(new EditPage("Изменение контента"));
        commands.add(new Design("Дизайн"));
        commands.add(new UIUX("UI/UX"));
        commands.add(new WebDesign("Web"));
        commands.add(new MotionDesign("Motion"));
        commands.add(new IllustrationDesign("Illustration"));
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
