package core;

import com.vk.api.sdk.objects.messages.Message;
import core.commands.Unknown;

import java.util.Collection;

public class CommandDeterminant {
    public static Command getCommand(Collection<Command> commands, Message message) {
        String body = message.getBody();
        String id = message.getUserId().toString();
        for (Command command : commands) {
            if (command.name.equals(body))
                return command;
            if (command.name.equals(id) && command.platform != null && command.text == null && command.type != null)
                command.text = body;
            if (command.name.equals(id) && command.platform != null && command.text != null && command.type != null)
                return command;
        }
        return new Unknown("unknown");
    }
}
