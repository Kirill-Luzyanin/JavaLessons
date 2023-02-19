public class MyLinkedList {
    private Node first = null;
    private Node last = null;
    private int size = 0;


    public boolean add(String value) {
        Node newNode = new Node(null, null, value);
        if (first == null) {
            first = newNode;
            //last = newNode;
            //size++;
        } else {
            last.setNext(newNode);
            newNode.setPrev(last);
            //last = newNode;
            //size++;
        }
        last = newNode;
        size++;

        return true;
    }

    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }

    }

    public int size() {
        return size;
    }

    public String[] toArray(){
        String[] res = new String[size];
        int index = 0;
        Node temp = first;
        while (temp!=null){
            res[index]=temp.getValue();
            index++;
            temp=temp.getNext();
        }
        return res;
    }

    public String get(int index) throws IndexNotCorrectException {
        if(index<0 || index>=size) throw new IndexNotCorrectException(index, size);
        return toArray()[index];
    }

}
