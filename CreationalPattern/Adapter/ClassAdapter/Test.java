package Adapter.ClassAdapter;

public class Test {
    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.editTextFile();
        targetable.editWordFile();
    }
}
