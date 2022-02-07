package Adapter.ObjectAdapter;

import Adapter.ClassAdapter.Source;
import Adapter.ClassAdapter.Targetable;

public class Test {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new ObjectAdapter(source);
        target.editWordFile();
        target.editTextFile();
    }
}
