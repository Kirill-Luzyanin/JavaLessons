public class Node {
    private Node prev = null;
    private Node next = null;
    private Person person = null;

    public Node(Node prev, Node next, Person value) {
        this.prev = prev;
        this.next = next;
        this.person = value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
