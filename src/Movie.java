public class Movie extends Product{
    private String director;

    Movie(){

    }
    public Movie(String name, double price, String director){
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount(double discount) {
        double amount = (getPrice() * (1 - discount / 100));
        System.out.printf("%s, %s, discounted price %.2f\n", getName(), director, amount);
        return amount;
    }

    @Override
    public String toString() {
        return "Movie{name='" + getName() + "', director='" + director + "', price=" + getPrice() + "}";
    }
}
