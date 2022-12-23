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
