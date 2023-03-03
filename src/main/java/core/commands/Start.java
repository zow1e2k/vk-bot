package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.CommandManager;
import core.enums.Buttons;
import vk.VKManager;

public class Start extends Command{
    public Start(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        String id = message.getPeerId().toString();
        new VKManager().sendButtonMessage(text(), message.getPeerId(), Buttons.START.getObj());
        if (!CommandManager.isExist(id)) {
            CommandManager.deleteCommandById(id);
        }
        CommandManager.addCommand(new Binding(id));
    }

    private String text(){
        String text = "Добрый день, Вас приветствует LIVE BOT.\n" +
                "Тут инфа о проекте\n" +
                "Еще инфа о проекте\n" +
                "Мало инфы о проекте не бывает!\n";
        return text;
    }

}
