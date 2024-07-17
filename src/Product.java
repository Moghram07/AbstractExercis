public abstract class Product {
    private String name;
    private double price;
    Product(){
    }
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getDiscount(double discount){
        double amount = price*(discount/100);
        return price - amount;
    }
}
