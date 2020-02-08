package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.CommandManager;
import core.enums.Buttons;
import vk.VKManager;

public class Design extends Command {
    public Design(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        String id = message.getUserId().toString();
        new VKManager().sendButtonMessage(text(), message.getUserId(), Buttons.PLATFORM_DESIGN.getObj());
        if (!CommandManager.isExist(id)) CommandManager.addCommand(new Brief(id));
    }

    private String text(){
        String info = "Для того, чтобы оформить заказ следуйте инструкциям.\n\n" +
                "Для начала выберите сферу дизайна из списка:\n\n";
        return info;
    }
}
