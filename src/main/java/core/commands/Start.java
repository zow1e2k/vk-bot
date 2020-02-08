package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.CommandManager;
import core.enums.Buttons;
import vk.VKManager;

public class Start extends Command{
    public Start(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        String id = message.getUserId().toString();
        new VKManager().sendButtonMessage(text(), message.getUserId(), Buttons.START.getObj());
        if (!CommandManager.isExist(id)) CommandManager.deleteCommandById(id);
    }

    private String text(){
        String text = "Добрый день, Вас приветствует бот Cabrera Microsystems.\n" +
                "Мы специализируемся на осуществлении широкого спектра услуг в области многопользовательских платформ серии GTA\n" +
                "В частности: Rage Multiplayer, San-Andreas Multiplayer, Criminal Russia Multiplayer\n" +
                "Наш бот поможет Вам: ознакомиться с соглашением и ценами, и, в конечном итоге сделать заказ.\n";
        return text;
    }

}
