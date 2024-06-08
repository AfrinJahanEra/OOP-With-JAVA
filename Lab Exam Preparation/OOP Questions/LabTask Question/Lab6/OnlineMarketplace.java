package Lab6;

import java.util.ArrayList;
import java.util.List;

// Review class
class Review {
    private String message;
    private int rating;

    public Review(String message, int rating) {
        this.message = message;
        this.rating = rating;
    }

    public String getMessage() {
        return message;
    }

    public int getRating() {
        return rating;
    }
}

// Product class
class Product {
    private String name;
    private double price;
    private String description;
    private String category;
    private List<Review> reviews;

    public Product(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
    public String getDescription() {
        return description;
    }
}

// Seller class
class Seller {
    private String name;
    private String email;
    private List<Product> products;

    public Seller(String name, String email) {
        this.name = name;
        this.email = email;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
}

// Customer class
class Customer {
    private String name;
    private String email;
    private List<Review> reviews;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }


    public List<Review> getReviews() {
        return reviews;
    }

    public void purchase(Product product) {
        // Add purchase logic here
        System.out.println(name + " purchased " + product.getName());
    }
}

public class OnlineMarketplace {
    public static void main(String[] args) {
        // Creating instances
        Seller seller1 = new Seller("John Doe", "johndoe@example.com");
        Product product1 = new Product("Laptop", 1200.00, "High-performance laptop", "Electronics");
        Review laptopReview = new Review("Great laptop!", 5);
        product1.addReview(laptopReview);
        seller1.addProduct(product1);

        Customer customer1 = new Customer("Alice Smith", "alice@example.com");
        customer1.purchase(product1);

        // Accessing data
        System.out.println("Product: " + product1.getName());
        System.out.println("Seller: " + seller1.getName());
        System.out.println("Customer: " + customer1.getName());
        System.out.println("Reviews for " + product1.getName() + ":");
        for (Review review : product1.getReviews()) {
            System.out.println("Message: " + review.getMessage() + ", Rating: " + review.getRating());
        }
    }
}

