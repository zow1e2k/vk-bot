import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import vk.VKCore;

public class Main {
    public static VKCore vkCore;

    static {
        try {
            vkCore = new VKCore();
        } catch (ApiException | ClientException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws NullPointerException, ApiException, InterruptedException {
        System.out.println("Running server...");
        CommandHandler commandHandler = new CommandHandler("VK_API", vkCore);
        commandHandler.start();
        MySQLHandler mySQLHandler = new MySQLHandler("MYSQL");
        mySQLHandler.start();
    }
}
