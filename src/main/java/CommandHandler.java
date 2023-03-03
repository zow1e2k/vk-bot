import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import vk.Messenger;
import vk.VKCore;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommandHandler extends Thread {
    private VKCore vkCore;
    public CommandHandler(String name, VKCore vkCore) {
        super(name);
        this.vkCore = vkCore;
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(300);

                try {
                    Message message = vkCore.getMessage();
                    if (message != null) {
                        ExecutorService exec = Executors.newCachedThreadPool();
                        exec.execute(new Messenger(message));
                    }
                }
                catch (ApiException | ClientException e) {
                    System.out.println("Возникли проблемы");
                    final int RECONNECT_TIME = 10000;
                    System.out.println("Повторное соединение через " + RECONNECT_TIME / 1000 + " секунд");
                    Thread.sleep(RECONNECT_TIME);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
    }
}
