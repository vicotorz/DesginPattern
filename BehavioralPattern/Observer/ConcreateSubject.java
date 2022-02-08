package Observer;

public class ConcreateSubject extends Subject {
    @Override
    public void notifyObserver(String message) {
        for (Object obj : observers) {
            System.out.println("notify observer " + message + " change");
            ((Observer) obj).dataChange(message);
        }
    }
}
