package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.enums.Buttons;
import vk.VKManager;

public class Help extends Command {
    public Help(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        new VKManager().sendButtonMessage(text(), message.getId()/*getUserId()*/, Buttons.RETURN.getObj());
    }

    private String text(){
        String text = "----------------------------------\n" +
                "\tLive Russia\n\nИнформация о проекте" +
                "----------------------------------\n";
        return text;
    }
}
