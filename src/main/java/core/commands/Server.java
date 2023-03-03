package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
//import core.CommandManager;
import core.enums.Buttons;
import vk.VKManager;

public class Server extends Command {
    public Server(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        //String id = message.getPeerId().toString();
        new VKManager().sendButtonMessage(text(), message.getPeerId(), Buttons.SERVER.getObj());
        //if (!CommandManager.isExist(id)) CommandManager.addCommand(new Brief(id));
    }

    private String text() {
        String text = "Введите свой никнейм:\n\n";
        return text;
    }
}