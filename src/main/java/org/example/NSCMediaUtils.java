package org.example;

/**
 * This class essentially exists with the sole purpose of printing the specific
 * piece of media's info using a toString method
 *
 * @author Nicholas Miller
 * @version 11/13/2023
 */
public class NSCMediaUtils {
    /**
     * Essentially just a toString method but can only accept items of the Media subclass
     *
     * @param mediaItem     mediaItem (Book, DVD, or Magazine) whose attributes will be printed to screen
     */
    public static <T extends Media> void printMediaDetails(T mediaItem) {
        System.out.println(mediaItem.toString());
    }
}
