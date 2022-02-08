package Flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MemoryFactory {
    private static List<Memory> memoryList = new ArrayList<Memory>();

    public static Memory getMemory(int size) {
        Memory memory = null;
        for (int i = 0; i < memoryList.size(); i++) {
            memory = memoryList.get(i);
            if (memory.getSize() == size && memory.isIsused() == false) {
                memory.setIsused(true);
                memoryList.set(i, memory);
                System.out.println("get memory from memoryList:" + memory);
                break;
            }
        }
        if (memory == null) {
            memory = new Memory(32, false, UUID.randomUUID().toString());
            memoryList.add(memory);
        }
        return memory;
    }

    public static void releaseMemeory(String id) {
        for(int i=0;i<memoryList.size();i++){
            Memory memory = memoryList.get(i);
            if(memory.getId().equals(id)){
                memory.setIsused(false);
                memoryList.set(i,memory);
                System.out.println("release memeory:" + id);
                break;
            }
        }
    }
}
