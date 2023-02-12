package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.enums.Buttons;
import vk.VKManager;

public class License extends Command {
    public License(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        new VKManager().sendButtonMessage(text(), message.getId()/*getUserId()*/, Buttons.RETURN.getObj());
    }

    private String text(){
        String text = "----------------------------------\n" +
                "Соглашение/лицензия/реквизиты:\n" +
                "Пункты\n" +
                "----------------------------------\n";
        return text;
    }
}
