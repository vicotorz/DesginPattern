package Proxy;

public class HR implements Company{
    @Override
    public void findWorker(String title) {
        System.out.println("I need to find a worker! title:" + title);
    }
}
