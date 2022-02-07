package Decorator;

public class Decorator implements Sourceable{
    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source = source;
    }

    @Override
    public void createComputer() {
       source.createComputer();
        System.out.println("make system");
    }
}
