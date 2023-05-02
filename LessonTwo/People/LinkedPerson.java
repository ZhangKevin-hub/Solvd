package People;

public class LinkedPerson {
    private Node<Person> head;
    private int size;

    public LinkedPerson() {
        this.head = null;
        this.size = 0;
    }

    public void add(Person person) {
        Node<Person> newNode = new Node<>(person);

        if (head == null) {
            head = newNode;
        } else {
            Node<Person> currNode = head;
            while (currNode.getNextPerson() != null) {
                currNode = currNode.getNextPerson();
            }
            currNode.setNext(newNode);
        }
        size++;
    }

    public void remove(int i) throws PersonNotFoundException {
        if (head == null) {
            throw new PersonNotFoundException("Person with name " + i + " not found.");
        }

        if (head.getPerson().getName().equals(i)) {
            head = head.getNextPerson();
            size--;
            return;
        }

        Node<Person> currNode = head.getNextPerson();
        Node<Person> prevNode = head;
        while (currNode != null) {
            if (currNode.getPerson().getName().equals(i)) {
                prevNode.setNext(currNode.getNextPerson());
                size--;
                return;
            }
            prevNode = currNode;
            currNode = currNode.getNextPerson();
        }

        throw new PersonNotFoundException("Person with name " + i + " not found.");
    }

    public int getSize() {
        return size;
    }

    public Person get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }

        Node<Person> currNode = head;
        for (int i = 0; i < index; i++) {
            currNode = currNode.getNextPerson();
        }
        return currNode.getPerson();
    }

    private static class Node<Person> {
        private Person person;
        private Node<Person> next;

        public Node(Person person) {
            this.person = person;
            this.next = null;
        }

        public Person getPerson() {
            return person;
        }

        public Node<Person> getNextPerson() {
            return next;
        }

        public void setNext(Node<Person> next) {
            this.next = next;
        }
    }
}
