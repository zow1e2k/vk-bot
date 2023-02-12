package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.CommandManager;
import vk.VKManager;
import core.enums.Admins;

public class ShowCommands extends Command {
    public ShowCommands(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        if (Admins.Admin.getId() == message.getId()/*getUserId()*/ || Admins.Admin.getId() == message.getId()/*getUserId()*/)
            new VKManager().sendMessage(CommandManager.getCommands().toString(), message.getId()/*getUserId()*/);
    }
}
