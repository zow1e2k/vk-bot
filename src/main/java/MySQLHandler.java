import java.sql.*;

public class MySQLHandler extends Thread {
    private Connection connection;

    public MySQLHandler(Connection connection, String name) {
        super(name);
        this.connection = connection;
    }

    public void run() {
        try {
            Statement statement = this.connection.createStatement();
            String nickname = "";
            int id = -1;
            ResultSet resultSet;
            System.out.println("MySQL Handler has been ran");

            while (true) {
                resultSet = statement.executeQuery("SELECT id, nickname FROM accounts");

                while (resultSet.next()) {
                    id = resultSet.getInt(1);
                    nickname = resultSet.getString(2);
                    System.out.println("id = " + id + ", nickname = " + nickname);
                }

                Thread.sleep(300);
                System.out.println("MySQL Thread");
            }
        } catch (InterruptedException | SQLException e) {
            System.out.println("Thread has been interrupted");
        }
    }
}
