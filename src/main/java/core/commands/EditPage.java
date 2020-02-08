package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.CommandManager;
import vk.VKManager;

public class EditPage extends Command {
    public EditPage(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        String id = message.getUserId().toString();
        new VKManager().sendMessage(text(), message.getUserId());
        CommandManager.setCommandType(id, "Изменение контента");
    }

    private String text(){
        String text = "Выбранный тип услуги: Изменение контента\n\n" +
                "Введите описание технического задания:";
        return text;
    }
}
