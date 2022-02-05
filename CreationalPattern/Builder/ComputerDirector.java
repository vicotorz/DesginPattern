package Builder;

public class ComputerDirector {
    public Computer constructComputer(ComputerBuilder computerBuilder){
        computerBuilder.buildmemory();
        computerBuilder.buildcpu();
        computerBuilder.buildDisk();
        return computerBuilder.buildComputer();
    }
}
