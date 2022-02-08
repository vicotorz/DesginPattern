package Iterator;


public class Test {
    public static void main(String[] args) {
        Collection collection = new ListCollection();
        collection.add("object1");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
