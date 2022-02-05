package Builder;

public class ComputerConcreateBuilder implements ComputerBuilder{

    Computer computer;

    public ComputerConcreateBuilder(){
        computer = new Computer();
    }

    @Override
    public void buildcpu() {
        computer.setCpu("8core");
    }

    @Override
    public void buildmemory() {
        computer.setMemory("16G");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("1TG");
    }

    @Override
    public Computer buildComputer() {
        return computer;
    }
}
