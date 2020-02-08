package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.CommandManager;
import core.enums.Buttons;
import vk.VKManager;

public class SAMP extends Command{
    public SAMP(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        String id = message.getUserId().toString();
        new VKManager().sendButtonMessage(text(), message.getUserId(), Buttons.TYPE.getObj());
        CommandManager.setCommandPlatform(id, "SAMP");
    }

    private String text(){
        String text = "Выбранная платформа: SAMP\n\n" +
                "Далее выберите тип услуги:";
        return text;
    }
}
