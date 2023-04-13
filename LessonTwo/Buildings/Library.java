package Buildings;
public class Library extends Location{
    private int books;

    public Library(int floors, String address, int books) {
        super(address, floors);
        this.books = books;
    }
    @Override
    public void display(){
        System.out.println("The Library has "+ books+" books!");
    }
}
