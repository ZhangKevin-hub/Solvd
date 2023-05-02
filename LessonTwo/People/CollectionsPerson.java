package People;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.PriorityQueue;

public class CollectionsPerson {
    private ArrayList<Person> arrayListPersons;
    private HashSet<Person> hashSetPersons;
    private TreeMap<String, Person> treeMapPersons;
    private PriorityQueue<Person> priorityQueuePersons;
    public CollectionsPerson() {
        this.arrayListPersons = new ArrayList<>();
        this.hashSetPersons = new HashSet<>();
        this.treeMapPersons = new TreeMap<>();
        this.priorityQueuePersons = new PriorityQueue<>();
    }
    
    public void addPerson(Person Person) {
        arrayListPersons.add(Person);
        hashSetPersons.add(Person);
        treeMapPersons.put(Person.getName(), Person);
        priorityQueuePersons.add(Person);
    }

    public void removePerson(String name) throws PersonNotFoundException {
        boolean found = false;

        hashSetPersons.removeIf(Person -> Person.getName().equals(name));

        if (!treeMapPersons.containsKey(name)) {
            throw new PersonNotFoundException("Person with name " + name + " not found.");
        }
        treeMapPersons.remove(name);

        found = priorityQueuePersons.removeIf(Person -> Person.getName().equals(name));
        if (!found) {
            throw new PersonNotFoundException("Person with name " + name + " not found.");
        }
    }

    public ArrayList<Person> getAllPersonsAsArrayList() {
        return arrayListPersons;
    }

    public HashSet<Person> getAllPersonsAsHashSet() {
        return hashSetPersons;
    }

    public TreeMap<String, Person> getAllPersonsAsTreeMap() {
        return treeMapPersons;
    }

    public PriorityQueue<Person> getAllPersonsAsPriorityQueue() {
        return priorityQueuePersons;
    }
}