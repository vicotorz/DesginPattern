package Iterator;

public class ConcreateIterator implements Iterator{
    private Collection collection;
    private int pos = -1;

    public ConcreateIterator(Collection collection){
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if(pos > 0){
            pos --;
        }
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if(pos<collection.size()-1){
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if(pos<collection.size()-1){
            return true;
        }else {
            return false;
        }
    }
}
