public class NodeList implements MyList{

    Node root;

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object add(int object) {
        if (root==null) {
            root = new Node();
            root.setNext(null);
            root.setValue(object);
        }
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
