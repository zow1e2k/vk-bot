package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.interfaces.ServiceCommand;
import core.modules.MeParser;
import vk.VKManager;

import java.io.IOException;

public class Me extends Command implements ServiceCommand {
    public Me(String name) {
        super(name);
    }
    @Override
    public void exec(Message message) {
        new VKManager().sendMessage(getName(), message.getUserId());
    }
    private String getName(){
        String name;
        try {
            name = new MeParser().getName();
        } catch (IOException e) {
            name = "не удалось получить имя";
        }
        return name;
    }
    @Override
    public void service() {
    }
}
