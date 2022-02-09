package State;

public class Test {
    public static void main(String[] args) {
        Context context = new Context(new WorkState());
        context.action();

        context.setState(new HolidayState());
        context.action();
    }
}
