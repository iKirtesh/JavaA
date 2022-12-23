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
