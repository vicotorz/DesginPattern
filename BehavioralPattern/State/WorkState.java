package State;

public class WorkState extends AbstractState{
    @Override
    public void action(Context context) {
        System.out.println("state change to work state");
    }
}
