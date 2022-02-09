package Memento;

public class Test {
    public static void main(String[] args) {
        Original original = new Original("zhangsan");

        Storage storage = new Storage(original.createMemento());

        System.out.println("original value:" + original.getValue());

        original.setValue("lisi");
        System.out.println("update value:" + original.getValue());

        original.restoreMemento(storage.getMemento());
        System.out.println("restore value:" + original.getValue());
    }
}
