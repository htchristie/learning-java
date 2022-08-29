package functionalProgramming.predicate.entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // static method as a predicate
    public static boolean staticProductPredicate(Product product) {
        return product.getPrice() >= 100.0;
    }

    // non-static method as a predicate
    public boolean nonStaticProductPredicate() {
        // utilizes the current instance of Product
        return price >= 100;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}
