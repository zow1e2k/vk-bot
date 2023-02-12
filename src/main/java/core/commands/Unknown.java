package core.commands;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.enums.Buttons;
import vk.VKManager;

public class Unknown extends Command{
    public Unknown(String name) {
        super(name);
    }
    @Override
    public void exec(Message message) {
        new VKManager().sendButtonMessage("Неизвестная команда", message.getPeerId(), Buttons.START.getObj());
    }
}
