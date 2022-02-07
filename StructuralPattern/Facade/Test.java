package Facade;

public class Test {
    public static void main(String[] args) {
        Starter starter = new Starter();
        starter.startup();
        System.out.println("--------");
        starter.shutdown();
    }
}
