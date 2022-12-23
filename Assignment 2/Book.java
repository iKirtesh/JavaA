public class Book extends Publication {

    private String author;

    // Define constructor to assign data members

    public Book() {
        super();
        this.author = null;

    }

    public Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    public void ordercopies(int pcopies) {
        setcopies(getcopies() + pcopies);

    }

    // Method sellcopy() of superclass publication is overridden

    public void sellcopy(int qty) {
        System.out.println("Total book sell : Rs. " + (qty * getprice()));
    }

}
