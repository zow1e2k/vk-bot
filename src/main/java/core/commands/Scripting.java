package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.CommandManager;
import core.enums.Buttons;
import vk.VKManager;

public class Scripting extends Command {
    public Scripting(String name){
        super(name);
    }
    @Override
    public void exec(Message message) {
        String id = message.getPeerId()/*getUserId()*/.toString();
        new VKManager().sendButtonMessage(text(), message.getPeerId()/*getUserId()*/, Buttons.PLATFORM.getObj());
        if (!CommandManager.isExist(id)) CommandManager.addCommand(new Brief(id));
    }

    private String text(){
        String info = "Для того, чтобы взаимодействовать с LIVE BOT используйте кнопки\n" +
                "Расположенные внизу экрана\n\n";
        return info;
    }
}
