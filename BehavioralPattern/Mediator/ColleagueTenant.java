package Mediator;

//租客
public class ColleagueTenant extends Colleague{
    @Override
    public boolean operation(String message) {
        System.out.println("tenant receive a message from mediator:" + message);
        return true;
    }
}
