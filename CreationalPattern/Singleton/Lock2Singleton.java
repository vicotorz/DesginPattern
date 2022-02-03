package Singleton;

public class Lock2Singleton {
    private volatile static Lock2Singleton singleton;

    private Lock2Singleton() {
    }

    public static Lock2Singleton getInstance() {
        if (singleton == null) {
            synchronized (Lock2Singleton.class) {
                if (singleton == null) {
                    singleton = new Lock2Singleton();
                }
            }
        }
        return singleton;
    }
}
