package Bridge;

public class OracleDriver implements Driver{
    @Override
    public void executeSQL() {
        System.out.println("execute sql by oracle driver");
    }
}
