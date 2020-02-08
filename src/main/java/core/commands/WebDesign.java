package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.CommandManager;
import vk.VKManager;

public class WebDesign extends Command {
    public WebDesign(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        String id = message.getUserId().toString();
        new VKManager().sendMessage(text(), message.getUserId());
        CommandManager.setCommandType(id, "Web");
        CommandManager.setCommandPlatform(id, "Дизайн");
    }

    private String text(){
        String text = "Выбранная сфера дизайна: Web\n\n" +
                "Введите описание технического задания:";
        return text;
    }
}
