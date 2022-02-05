package Adapter.ObjectAdapter;

import Adapter.ClassAdapter.Source;
import Adapter.ClassAdapter.Targetable;

public class ObjectAdapter implements Targetable {
    private Source source;

    public ObjectAdapter(Source source){
        super();
        this.source = source;
    }

    @Override
    public void editTextFile() {
        this.source.editTextFile();
    }

    @Override
    public void editWordFile() {
        System.out.println("a word file editing");
    }
}
