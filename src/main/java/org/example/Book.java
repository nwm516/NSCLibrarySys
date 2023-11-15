package org.example;

import java.util.Objects;

/**
 * One of the three media types to be recognized and allowed
 * within the NSCLibraryMediaContainer class' ArrayList
 *
 * @author Nicholas Miller
 * @version 11/13/2023
 */
public class Book implements Media {
    /**
     * Assigns book's title to String
     */
    private String title;
    /**
     * Assigns book's author to String
     */
    private String author;
    /**
     * Assigns book's ISBN number to a string
     */
    private String isbn;
    /**
     * Boolean indicating if it's part of the
     * North Seattle College special collection
     */
    private boolean NSCCollection;

    /**
     * Book's constructor
     * @param title     Book's title
     * @param author    Book's author
     * @param isbn      Book's ISBN
     * @param NSCCollection NSC Special Collection status
     */
    public Book(String title, String author, String isbn, boolean NSCCollection) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.NSCCollection = NSCCollection;

        //Null Checks
        Objects.requireNonNull(title, "Title cannot be null.");
        Objects.requireNonNull(author, "Author cannot be null.");
        Objects.requireNonNull(isbn, "ISBN cannot be null.");
        Objects.requireNonNull(NSCCollection, "NSC Collection Status cannot be null");

    }

    /**
     * Overridden toString method for book's details
     * @return  list book's title, author, ISBN, and NSC Special Collection status
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", NSC Collection: " + NSCCollection;
    }
}
