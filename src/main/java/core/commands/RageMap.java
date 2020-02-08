package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.CommandManager;
import core.enums.Buttons;
import vk.VKManager;

public class RageMap extends Command {
    public RageMap(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        String id = message.getUserId().toString();
        new VKManager().sendButtonMessage(text(), message.getUserId(), Buttons.TYPE_MAP.getObj());
        CommandManager.setCommandPlatform(id, "Rage MP");
    }

    private String text(){
        String text = "Выбранная платформа: Rage MP\n\n" +
                "Далее выберите тип услуги:";
        return text;
    }
}
