package Facade;

public class Starter {
    private Dashboaard dashboaard;
    private Engine engine;
    private SelfCheck selfCheck;

    public Starter(){
        dashboaard = new Dashboaard();
        engine = new Engine();
        selfCheck = new SelfCheck();
    }

    public void startup(){
        engine.startup();
        dashboaard.startup();
        selfCheck.startupCheck();
        System.out.println("car startup finished");
    }

    public void shutdown(){
        selfCheck.shutdownCheck();
        engine.shutdown();
        dashboaard.shutdown();
        System.out.println("car shutdown finished");
    }
}
