package Bridge;

public class MyDriverBridge extends DriverManagerBridge {
    public void execute() {
        getDriver().executeSQL();
    }
}
