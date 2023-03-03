package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.enums.Buttons;
import vk.VKManager;

public class Binding extends Command {
    public Binding(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        //String id = message.getPeerId().toString();
        new VKManager().sendButtonMessage(text(), message.getPeerId(), Buttons.SERVER.getObj());
        //if (!CommandManager.isExist(id)) CommandManager.addCommand(new Brief(id));
    }

    private String text() {
        String text = "Выберите сервер:\n\n";
        return text;
    }
}
