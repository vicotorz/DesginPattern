package Observer;

public class ConcreateObserver implements Observer {
    @Override
    public void dataChange(String message) {
        System.out.println("receive message:" + message);
    }
}
