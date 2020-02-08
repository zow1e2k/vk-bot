package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.Commander;
import core.enums.Buttons;
import vk.VKManager;
import core.CommandManager;

public class Brief extends Command {
    private String admMsg = "[Новый заказ #" +
            this.name + "]\n[" +
            this.platform + "]\n[\n" +
            this.type + "]\n\n" +
            this.text +
            "\n\nЗаказ от: https://vk.com/id";

    private String btnMsg = "[Ваш заказ #" +
            this.name + "]\n[" +
            this.platform + "]\n[" +
            this.type + "]\n\n" +
            this.text +
            "\n\nЗаказ отправлен главному менеджеру." +
            "\nОжидайте, в скором времени с Вами свяжутся.";

    public Brief(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        new VKManager().sendMessageToAdm(this.admMsg + message.getUserId());
        new VKManager().sendButtonMessage(this.btnMsg, message.getUserId(), Buttons.RETURN.getObj());

        if (this.platform.equals("Дизайн")) {
            new VKManager().sendMessageToDesigner(this.admMsg + message.getUserId());
        }

        CommandManager.deleteCommand(this);
    }
}
