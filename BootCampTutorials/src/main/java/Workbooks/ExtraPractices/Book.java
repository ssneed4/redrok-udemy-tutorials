package src.main.java.Workbooks.ExtraPractices;

public class Book {
    
    private String title;
    private String author;
    private double rating;
    private double price;


    public Book() {
    }

    public Book(Book source){
        this.title = source.title;
        this.price = source.price;
        this.author = source.author;
        this.rating = source.rating;
    }


    public Book(String title, String author, double rating, double price) {
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.price = price;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    


}
