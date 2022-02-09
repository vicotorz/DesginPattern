package Mediator;

public class Test {
    public static void main(String[] args) {
        Colleague colleagueTenant = new ColleagueTenant();
        Colleague colleagueLandlord = new ColleagueLandlord();

        ConcreateMediator concreateMediator = new ConcreateMediator(colleagueTenant, colleagueLandlord);
        boolean result = concreateMediator.notifyColleagueTenant("想租2室1厅吗？");
        if (result) {
            concreateMediator.notifyColleagueTenant("租了");
        } else {
            concreateMediator.notifyColleagueTenant("没租");
        }
    }
}
