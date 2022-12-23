public class MainClass {
    public static void main(String[] args) {
        Publication obj = new Publication("Java", 200, 5);
        obj.sellcopy(2);

        Publication obj1 = new Book("Java", 100, 10, "James Gosling");
        obj1.sellcopy(3);

        Publication obj2 = new Magazine("Java", 200, 5, 6, "September");
        obj2.sellcopy(4);

    }
}
