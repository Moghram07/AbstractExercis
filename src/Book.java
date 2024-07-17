public class Book extends Product{
    private String author;
    Book(){
    }
    public Book(String name, double price, String author){
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public double getDiscount(double discount) {
        double amount = getPrice() - (getPrice() * (discount / 100));
        System.out.printf("%s book by %s, discounted price %.2f\n", getName(), author, amount);
        return amount;
    }

    @Override
    public String toString() {
        return "Book{name='" + getName() + "', director='" + author + "', price=" + getPrice() + "}";
    }
}
