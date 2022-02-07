package Adapter.InterfaceAdapter;

public class Test {
    public static void main(String[] args) {
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();
        source1.editTextFile();
        source2.editWordFile();
    }
}
