package Prototype;

public class Test {
    public static void main(String[] args) {
        //浅复制
        Computer computer = new Computer("8core", "16G", "1TB");
        System.out.println(computer.toString());
        Computer computerClone = (Computer) computer.clone();
        System.out.println(computerClone.toString());

        //深复制
        Disk disk = new Disk("208G", "2TB");
        ComputerDetail computerDetail = new ComputerDetail("8core", "16G", disk);
        System.out.println(computerDetail.toString());
        ComputerDetail computerDetailClone = (ComputerDetail) computerDetail.clone();
        System.out.println(computerDetailClone.toString());
    }

}
