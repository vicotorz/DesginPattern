package Builder;

public class Test {
    public static void main(String[] args) {

        ComputerBuilder computerBuilder = new ComputerConcreateBuilder();
        ComputerDirector computerDirector = new ComputerDirector();

        Computer computer = computerDirector.constructComputer(computerBuilder);
        System.out.println(computer.getCpu());
        System.out.println(computer.getDisk());
        System.out.println(computer.getMemory());
    }
}
