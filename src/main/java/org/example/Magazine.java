package org.example;

import java.util.Objects;

/**
 * One of the three media types to be recognized and allowed
 * within the NSCLibraryMediaContainer class' ArrayList
 *
 * @author Nicholas Miller
 * @version 11/13/2023
 */
public class Magazine implements Media {
    /**
     * Assigns magazine's title to String
     */
    private String title;
    /**
     * Assigns magazine's issue number to int
     */
    private int issueNumber;
    /**
     * Assigns magazine's month to int
     */
    private int month;
    /**
     * Boolean indicating if it's part of the
     * North Seattle College special collection
     */
    private boolean NSCCollection;

    /**
     * Magazine's constructor
     * @param title     Magazine's title
     * @param issueNumber   Magazine's issue number
     * @param month     Magazine's month of issue
     * @param NSCCollection     NSC Special Collection status
     */
    public Magazine(String title, int issueNumber, int month, boolean NSCCollection) {
        this.title = title;
        this.issueNumber = issueNumber;
        this.month = month;
        this.NSCCollection = NSCCollection;

        //Null Checks
        Objects.requireNonNull(title, "Title cannot be null.");
        Objects.requireNonNull(issueNumber, "Issue number cannot be null.");
        Objects.requireNonNull(month, "Month cannot be null.");
        Objects.requireNonNull(NSCCollection, "NSC Collection Status cannot be null");
    }

    /** Overridden toString method for magazine's details
     * @return  lists magazine's title, issue number, month of issue, and NSC Special Collection status
     */
    public String toString() {
        return "Title: " + title + ", Issue Number: " + issueNumber + ", Month: " + month + ", NSC Collection: " + NSCCollection;
    }
}
