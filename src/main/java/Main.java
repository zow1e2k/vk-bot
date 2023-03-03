import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import vk.VKCore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static VKCore vkCore;
    public static Connection connection;

    static {
        try {
            vkCore = new VKCore();
        } catch (ApiException | ClientException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws NullPointerException, SQLException {
        System.out.println("Running server... v.1.0.0");
        CommandHandler commandHandler = new CommandHandler("VK_API", vkCore);
        commandHandler.start();
        /*Main.connection = DriverManager.getConnection(
                "jdbc:mariadb://62.122.213.116:3310/vk_bot?user=plaka&password=lD8tH9gC9b"
        );*/
        System.out.println("[debug] commandHandler start");
        Main.connection = DriverManager.getConnection(
                "jdbc:mariadb://92.63.103.87:3306/vk_bot?user=zow1k&password=1597538624"
        );
        System.out.println("[debug] init Main.connection");
        MySQLHandler mySQLHandler = new MySQLHandler(Main.connection, "MYSQL");
        System.out.println("[debug] Main.connection start");
        mySQLHandler.start();
        System.out.println("[debug] Main.connection started");
    }
}
