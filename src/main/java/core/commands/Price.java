package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.enums.Buttons;
import vk.VKManager;

public class Price extends Command{
    public Price(String name){
        super(name);
    }

    @Override
    public void exec(Message message) {
        new VKManager().sendButtonMessage(text(), message.getUserId(), Buttons.RETURN.getObj());
    }

    private String text(){
        String text = "----------------------------------\n" +
                "Создание игрового мода с нуля:\n\n" +
                "Rage MP:\n\n" +
                "DM/TDM/Race: \t от 2000 руб.\n" +
                "RolePlay: \t от 12000 руб.\n" +
                "SAMP/CRMP:\n\n" +
                "DM/TDM/Race: \t от 1000 руб.\n" +
                "RolePlay: \t от 10000 руб.\n" +
                "----------------------------------\n" +
                "Исправление ошибок:\n\n" +
                "Серверных: \t от 100 руб.\n" +
                "Клиентских: \t от 50 руб.\n" +
                "----------------------------------\n" +
                "Внедрение систем:\n\n" +
                "С нуля: \t от 50 руб.\n" +
                "С открытого источника: \t от 25 руб.\n" +
                "----------------------------------\n" +
                "Маппинг:\n\n" +
                "Rage MP:\n\n" +
                "С нуля: \t от 100 руб.\n" +
                "С открытого источника: \t от 50 руб." +
                "SAMP/CRMP:\n\n" +
                "С нуля: \t от 50 руб.\n" +
                "С открытого источника: \t от 25 руб.\n" +
                "----------------------------------\n" +
                "Создание сайта:\n\n" +
                "Стандарт клиент-сервер: \t от 1000 руб.\n" +
                "Single Page Application (SPA) [Angular]: \t от 2000 руб.\n" +
                "Исправление ошибок:\n\n" +
                "Стандарт клиент-сервер: \t от 50 руб.\n" +
                "Single Page Application (SPA) [Angular]: \t от 100 руб.\n" +
                "Изменение контента:\n\n" +
                "Стандарт клиент-сервер: \t от 50 руб.\n" +
                "Single Page Application (SPA) [Angular]: \t от 100 руб.\n" +
                "----------------------------------\n" +
                "Дизайн:\n\n" +
                "Оформление темы: \t от 1000 руб.\n" +
                "Промо ролик: \t от 2500 руб.\n" +
                "Рекламный баннер: \t от 500 руб.\n" +
                "Упаковка социальных и медиа сетей: \t от 1200 руб.\n" +
                "Брендинг, айдентика: \t от 2000 руб.\n" +
                "Лендинг страницы: \t от 4000 руб.\n" +
                "Афишы, флаеры: \t от 400 руб.\n" +
                "Типография и разработка шрифтов: \t от 2000 руб.\n" +
                "----------------------------------\n";
        return text;
    }
}
