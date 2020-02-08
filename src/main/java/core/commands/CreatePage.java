package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.CommandManager;
import vk.VKManager;

public class CreatePage extends Command {
    public CreatePage(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        String id = message.getUserId().toString();
        new VKManager().sendMessage(text(), message.getUserId());
        CommandManager.setCommandType(id, "Создание сайта");
    }

    private String text(){
        String text = "Выбранный тип услуги: Создание сайта\n\n" +
                "Введите описание технического задания:";
        return text;
    }
}
