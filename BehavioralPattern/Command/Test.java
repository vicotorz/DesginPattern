package Command;

public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new ConcreateCommand(receiver);
        Invoker invoker = new Invoker(cmd);

        invoker.action("command1");
    }
}
