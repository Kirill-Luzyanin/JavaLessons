public class MyLinkedList {
    private Node first = null;
    private Node last = null;
    private int size = 0;

    public boolean add(Person person) {
        Node newNode = new Node(null, null, person);
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

    // 2.
    public boolean addFirst(Person person) {
        Node newNode = new Node(null, null, person);
        if (first == null) {
            first = newNode;
            last = newNode;
            size++;
        } else {
            first.setPrev(newNode);
            newNode.setNext(first);
            first = newNode;
            size++;
        }
        return true;
    }

    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.getPerson());
            temp = temp.getNext();
        }

    }

    public String toString(){
        String rez="";
        Node temp = first;
        while (temp!=null){
            rez+=temp.getPerson()+"\n";
            temp=temp.getNext();
        }
        return rez;
    }

    public int size() {
        return size;
    }

    public Person[] toArray() {
        Person[] res = new Person[size];
        int index = 0;
        Node temp = first;
        while (temp != null) {
            res[index] = temp.getPerson();
            index++;
            temp = temp.getNext();
        }
        return res;
    }

    public Person get(int index) {
        if (index < 0 || index >= size) return null;
        return toArray()[index];
    }

    // 3.
    // 3.1 метод поиска Node по index
    private Node find(int index) {
        if (index < 0 || index >= size) throw new IllegalArgumentException();
        int counter = 0;
        Node res = first;
        while (counter < index) {
            res = res.getNext();
            counter++;
        }
        return res;
    }

    // 3.2 метод поиска Node по person
    private Node find(Person person) {
        Node res = first;
        while (res != null) {
            Person temp = res.getPerson();
            if (person == null && temp == null) return res;
            if (person.equals(temp)) return res;
            res = res.getNext();
        }
        return null;
    }

    // 3.3 метод удаления по Node
    private Person remove(Node node) {
        if (node == null && first == null) return null;
        Person res = node.getPerson();
        if (node == first || node == last) {
            if (node == first) {
                first = first.getNext();
                first.setPrev(null);
                node.setNext(null);
            }
            if (node == last) {
                last = last.getPrev();
                last.setNext(null);
                node.setPrev(null);
            }
        } else {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
            node.setPrev(null);
            node.setNext(null);
            node.setPerson(null);
        }
        size--;
        return res;
    }

    // 3.final

    public Person remove(int index){
        Node node=find(index);
        if (node!=null){
            return remove(node);
        } else {
            return null;
        }
    }


    // 4.

    public boolean remove(Person person) {
        Node node = find(person);
        if (node != null) {
            remove(node);
            return true;
        } else {
            return false;
        }
    }

}
