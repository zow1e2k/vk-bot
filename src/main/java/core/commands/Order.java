package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.CommandManager;
import core.enums.Buttons;
import vk.VKManager;

public class Order extends Command {
    public Order(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        String id = message.getUserId().toString();
        new VKManager().sendButtonMessage(text(), message.getUserId(), Buttons.ACTIVITY.getObj());
        if (!CommandManager.isExist(id)) CommandManager.addCommand(new Brief(id));
    }

    private String text(){
        String info = "Для того, чтобы оформить заказ следуйте инструкциям.\n\n" +
                "Для начала выберите вид деятельности:\n\n";
        return info;
    }
}
