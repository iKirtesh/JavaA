public class Publication {
    public String title;
    public double price;
    public int copies;

    public Publication(){
        this.title=null;
        this.price=0;
        this.copies=0;
    }
    public Publication(String title, double price, int copies){
        this.title = title;
        this.price = price;
        this.copies = copies;
    }
    public int getcopies(){
        return this.copies;
    }
    public void setcopies(int copies){
        this.copies = copies;
    }
    public void sellcopy(int qty){
        System.out.println("Total publication sell : Rs." + (qty * price));
    }
}
class book extends Publication{
    private String author;

    public book() {
        super();
        this.author = null;
    }

    public book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;

    }

    public void ordercopies(int pcopies) {
        setcopies(getcopies() + pcopies);
    }

    public void sellcopy(int qty) {
        System.out.println("Total Book sell: Rs." + (qty * price));
    }
}
class magazine extends Publication {
    private int orderQty;
    private String currIssue;

    public magazine(String title, double price, int copies, int orderQty, String currIssue) {
        super(title, price, copies);
        this.orderQty = orderQty;
        this.currIssue = currIssue;
    }

    public void recvNewIssue(String pNewIssue) {
        setcopies(orderQty);
        currIssue = pNewIssue;
    }

    public void sellcopy(int qty) {
        System.out.println("Total Magazine sell : Rs." + (qty * price));
    }
}
class mainClass {
    public static void main(String[] args) {
        Publication obj = new Publication("Java", 200, 5);
        obj.sellcopy(2);

        Publication obj1 = new book("Java", 200 , 5, "James Gaoslin");
        obj.sellcopy(3);

        Publication obj2 = new magazine("Java", 200,5,6,"Sept");
        obj2.sellcopy(4);
    }
}
