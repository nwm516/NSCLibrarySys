package org.example;

/**
 * Defines the NSCLibraryMediaContainer class.
 * It contains the ArrayList used solely for storing instances of the three class types:
 * Book, DVD, and Magazines.
 *
 * Has add(), remove(), and display() methods for adding, removing and displaying
 * media items within the ArrayList
 *
 * @author  Nicholas Miller
 * @version 11/13/2023
 */

import java.util.ArrayList;

/**
 * NSCLibraryMediaContainer only accepts the media items of the three types,
 * which are implemented with the Media tag (hence the extends within the parameter)
 * @param <T>   media items that implement the Media type interface
 */
public class NSCLibraryMediaContainer<T extends Media> {

    /**
     * ArrayList for holding media items of the restricted types
     */
    public ArrayList<T> mediaList;

    /**
     * NSCLibraryMediaContainer constructor,
     * which instantiaties an ArrayList called mediaList
     */
    public NSCLibraryMediaContainer() {
        mediaList = new ArrayList<>();
    }

    /**
     * Adds media items to the ArrayList
     * @param mediaItem     media item to be added to list
     */
    public void add(T mediaItem) {
        mediaList.add(mediaItem);
   }

    /**
     * Removes media items from the ArrayList
     * @param mediaItem     media item to be removed from the list
     */
   public void remove(T mediaItem) {
        mediaList.remove(mediaItem);
   }

    /**
     * Displays the items within the ArrayList
     * using a for-each loop
     */
   public void display() {
       for (T mediaItem : mediaList) {
           System.out.println(mediaItem.toString());
       }
   }
}
