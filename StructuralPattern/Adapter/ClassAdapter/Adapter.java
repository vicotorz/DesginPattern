package Adapter.ClassAdapter;

public class Adapter extends Source implements Targetable{
    @Override
    public void editTextFile() {

    }

    @Override
    public void editWordFile() {
        System.out.println("a word file editing");
    }
}
