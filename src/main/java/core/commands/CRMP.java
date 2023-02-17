package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.CommandManager;
import core.enums.Buttons;
import vk.VKManager;

public class CRMP extends Command {
    public CRMP(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        String id = message.getPeerId()/*getUserId()*/.toString();
        new VKManager().sendButtonMessage(text(), message.getPeerId()/*getUserId()*/, Buttons.TYPE.getObj());
        CommandManager.setCommandPlatform(id, "CRMP");
    }

    private String text(){
        String text = "Выбранная платформа: CRMP\n\n" +
                "Далее выберите тип услуги:";
        return text;
    }
}
