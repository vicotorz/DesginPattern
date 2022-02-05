package Cloneable;

public class ComputerDetail implements Cloneable {
    private String cpu;
    private String memory;
    private Disk disk;// 引用的对象

    public ComputerDetail(String cpu, String memory, Disk disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    // 深复制
    public Object clone() {
        try {
            ComputerDetail computerDetail = (ComputerDetail) super.clone();
            computerDetail.disk = (Disk) this.disk.clone();
            return computerDetail;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return "cpu:" + cpu + " memory:" + memory + " disk:" + disk;
    }
}
