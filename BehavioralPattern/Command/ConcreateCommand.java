package Command;

public class ConcreateCommand implements Command{

    private Receiver receiver;

    public ConcreateCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void exe(String command) {
        receiver.action(command);
    }
}
