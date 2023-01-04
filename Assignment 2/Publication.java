public class Publication {

    public String title;
    public double price;
    public int copies;

    // Default Constructor to assign
    public Publication() {
        title = null;
        price = 0.0;
        copies = 0;
    }

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    public int getcopies() {
        return this.copies;
    }

    public void setcopies(int copies) {
        this.copies = copies;
    }

    public double getprice() {
        return this.price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public void sellcopy(int qty) {
        System.out.println("Total publication sell : Rs. " + (qty * price));
    }

}





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




public class Magazine extends Publication {

    private int orderQty;
    private String currIssue;

    // Define constructor to assign data members
    public Magazine(String title, double price, int copies, int orderQty, String currIssue) {
        super(title, price, copies);
        this.orderQty = orderQty;
        this.currIssue = currIssue;

    }

    public void receciveIssue(String pNewIssue) {
        setcopies(orderQty);
        currIssue = pNewIssue;
    }

    // Method sellcopy() of superclass publication is overridden
    public void sellcopy(int qty) {
        System.out.println("Total magazine sell : Rs. " + (qty * getprice()));
    }

}
