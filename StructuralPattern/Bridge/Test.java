package Bridge;

public class Test {
    public static void main(String[] args) {
        DriverManagerBridge driverManagerBridge = new MyDriverBridge();
        driverManagerBridge.setDriver(new MysqlDriver());
        driverManagerBridge.execute();

        driverManagerBridge.setDriver(new OracleDriver());
        driverManagerBridge.execute();
    }
}
