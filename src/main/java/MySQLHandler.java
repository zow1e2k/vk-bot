public class MySQLHandler extends Thread {
    public MySQLHandler(String name) {
        super(name);
    }

    public void run() {
        try {
            //HostAddress host = HostAddress.from("", "");

            while (true) {
                Thread.sleep(300);
                System.out.println("MySQL Thread");
            }
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
    }
}
