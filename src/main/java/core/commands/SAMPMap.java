package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.CommandManager;
import core.enums.Buttons;
import vk.VKManager;

public class SAMPMap extends Command {
    public SAMPMap(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        String id = message.getUserId().toString();
        new VKManager().sendButtonMessage(text(), message.getUserId(), Buttons.TYPE_MAP.getObj());
        CommandManager.setCommandPlatform(id, "SAMP/CRMP");
    }

    private String text(){
        String text = "Выбранная платформа: SAMP/CRMP\n\n" +
                "Далее выберите тип услуги:";
        return text;
    }
}
