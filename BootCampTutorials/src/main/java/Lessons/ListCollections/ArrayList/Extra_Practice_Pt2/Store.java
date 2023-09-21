package src.main.java.Lessons.ListCollections.ArrayList.Extra_Practice_Pt2;

import java.util.ArrayList;
import java.util.Objects;

public class Store {
    
    private ArrayList<Book> books;

    
    public Store() {
        this.books = new ArrayList<Book>();
    }

    public Store(ArrayList<Book> books) {
        this.books = books;
    }

    public Book getBook(int index){
        Book copy = new Book(this.books.get(index));
        return copy;
    }

    public void setBook(int index, Book newBook){
        Book copy = new Book(newBook);
        this.books.set(index, new Book(copy));
    }

    public void addBook(Book book){
        this.books.add(new Book(book));
    }

    public boolean contains(Book book) {
        return this.books.contains(book);
    }

    public void sellBook(String title){
        for(int i=0; i<this.books.size();i++){
                if(books.get(i).getTitle().equals(title)){
                    this.books.remove(i);
                }
        }

    }

}
