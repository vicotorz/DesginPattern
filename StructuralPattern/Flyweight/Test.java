package Flyweight;

public class Test {
    public static void main(String[] args) {
        Memory memory = MemoryFactory.getMemory(32);
        MemoryFactory.releaseMemeory(memory.getId());
        MemoryFactory.getMemory(32);
    }
}
