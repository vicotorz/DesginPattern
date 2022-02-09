package Mediator;

public class ConcreateMediator extends Mediator {

    public ConcreateMediator(Colleague colleagueTenant, Colleague colleagueLandlord) {
        super(colleagueTenant, colleagueLandlord);
    }

    @Override
    public boolean notifyColleagueTenant(String message) {
        if(colleagueTenant!=null){
            return colleagueTenant.operation(message);
        }
        return false;
    }

    @Override
    public boolean notifyColleagueLandlord(String message) {
        if(colleagueLandlord!=null){
            return colleagueLandlord.operation(message);
        }
        return false;
    }
}
