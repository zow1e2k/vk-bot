package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.CommandManager;
import core.enums.Buttons;
import vk.VKManager;

public class StandartWeb extends Command {
    public StandartWeb(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        String id = message.getUserId().toString();
        new VKManager().sendButtonMessage(text(), message.getUserId(), Buttons.TYPE_WEB.getObj());
        CommandManager.setCommandPlatform(id, "Стандарт клиент-сервер");
    }

    private String text(){
        String text = "Выбранная платформа: Стандарт клиент-сервер\n\n" +
                "Далее выберите тип услуги:";
        return text;
    }
}
