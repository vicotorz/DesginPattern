package Observer;


public class Test {
    public static void main(String[] args) {
        Subject subject = new ConcreateSubject();
        Observer obs = new ConcreateObserver();
        subject.add(obs);
        subject.notifyObserver("data1");
    }
}
