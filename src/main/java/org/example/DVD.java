package org.example;

import java.util.Objects;

/**
 * One of the three media types to be recognized and allowed
 * within the NSCLibraryMediaContainer class' ArrayList
 *
 * @author Nicholas Miller
 * @version 11/13/2023
 */
public class DVD implements Media{
    /**
     * Assigns DVD's title to String
     */
    private String title;
    /**
     * Assigns DVD's duration to String
     */
    private String duration;
    /**
     * Assigns DVD's genre to String
     */
    private String genre;
    /**
     * Boolean indicating if it's part of the
     * North Seattle College special collection
     */
    private boolean NSCCollection;

    /**
     * DVD's constructor
     * @param title     DVD's title
     * @param duration  DVD's duration
     * @param genre     DVD's genre
     * @param NSCCollection NSC Special Collection status
     */
    public DVD(String title, String duration, String genre, boolean NSCCollection) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.NSCCollection = NSCCollection;

        //Null Checks
        Objects.requireNonNull(title, "Title cannot be null.");
        Objects.requireNonNull(duration, "Duration cannot be null.");
        Objects.requireNonNull(genre, "Genre cannot be null.");
        Objects.requireNonNull(NSCCollection, "NSC Collection Status cannot be null");
    }

    /**
     * Overridden toString method for DVD's details
     * @return  lists DVD's title, duration, genre, and NSC Special Collection status
     */
    public String toString() {
        return "Title: " + title + ", Duration: " + duration + ", Genre: " + genre + ", NSC Collection: " + NSCCollection;
    }
}
