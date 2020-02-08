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
        new VKManager().sendButtonMessage(text(), message.getUserId(), Buttons.RETURN.getObj());
    }

    private String text(){
        String text = "----------------------------------\n" +
                "\tSingle Page Application:\n\n" +
                "Это веб-приложение или веб-сайт, использующий единственный HTML-документ как оболочку для " +
                "всех веб-страниц и организующий взаимодействие с пользователем через динамически подгружаемые HTML, CSS, JavaScript.\n\n" +
                "\tUX/UI дизайн\n\n" +
                "Это проектирование любых пользовательских интерфейсов в которых удобство использования так же важно как и внешний вид.\n\n" +
                "\tWeb дизайн:\n\n" +
                "Это отрасль веб-разработки и разновидность дизайна, в задачи которой входит проектирование пользовательских веб-интерфейсов для сайтов или веб-приложений.\n\n" +
                "Motion дизайн\n\n" +
                "Это визуальное оформление для видео, создание анимаций.\n\n" +
                "Illustration дизайн\n\n" +
                "Это процесс визуального общения и решения проблем с использованием типографики, фотографии и иллюстрации. " +
                "Поле считается подмножеством визуальной коммуникации и коммуникационного дизайна.\n" +
                "----------------------------------\n";
        return text;
    }
}
