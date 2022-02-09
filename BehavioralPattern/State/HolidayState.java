package State;

public class HolidayState extends AbstractState{
    @Override
    public void action(Context context) {
        System.out.println("state change to holiday state");
    }
}
