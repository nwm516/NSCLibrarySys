package org.example;

/** Test class for the NSCLibraryMediaContainer
 * and the three media types capable of being stored in them
 *
 * @author  Nicholas Miller
 * @version 11/13/2023
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class NSCLibraryTest {

    NSCLibraryMediaContainer<Book> bookContainer = new NSCLibraryMediaContainer();
    NSCLibraryMediaContainer<DVD> dvdContainer = new NSCLibraryMediaContainer();
    NSCLibraryMediaContainer<Magazine> magContainer = new NSCLibraryMediaContainer();

    // Book Creation
    Book wildThingsAre = new Book("Where the Wild Things Are", "Maurice Sendak", "1234567890", true);
    Book catHat = new Book("The Cat in the Hat", "Dr. Seuss", "1122334455", false);
    Book charWeb = new Book("Charlotte's Web", "E.B. White", "9876543210", true);

    // DVD Creation
    DVD goonies = new DVD ("The Goonies", " 1 hr. 54 min.", "Action", true);
    DVD princessBride = new DVD("The Princess Bride", "1 hr. 38 min.", "Action/Comedy", true);
    DVD neverendingStory = new DVD("The Neverending Story", "1 hr. 42 min.", "Fantasy", false);

    // Magazine Creation
    Magazine natGeo = new Magazine("National Geographic", 123, 3, true);
    Magazine wired = new Magazine("Wired", 445, 5, false);
    Magazine rollingStone = new Magazine("Rolling Stone", 789, 12, false);

    // Book Testing
    @Test
    public void bookAddTest() {
        bookContainer.add(wildThingsAre);
        bookContainer.add(catHat);
        bookContainer.add(charWeb);

        bookContainer.display();
        System.out.println();
    }
    @Test
    public void bookConstructorTest() {
        Book goodnightMoon = new Book("Goodnight Moon", "Margaret Wise Brown", "0064430170", false);
        assertNotNull(goodnightMoon);
    }
    @Test
    public void bookToStringTest() {
        Book goodnightMoon = new Book("Goodnight Moon", "Margaret Wise Brown", "0064430170", false);
        assertEquals("Title: Goodnight Moon, Author: Margaret Wise Brown, ISBN: 0064430170, NSC Collection: false", goodnightMoon.toString());
    }
    @Test
    public void bookNullValuesTest() {
        assertThrows(NullPointerException.class, () -> new Book(null, "Author", "ISBN", true));
        assertThrows(NullPointerException.class, () -> new Book("Title", null, "ISBN", true));
        assertThrows(NullPointerException.class, () -> new Book("Title", "Author", null, true));
    }

    // DVD Testing
    @Test
    public void dvdAddTest() {
        dvdContainer.add(goonies);
        dvdContainer.add(princessBride);
        dvdContainer.add(neverendingStory);

        dvdContainer.display();
        System.out.println();
    }
    @Test
    public void dvdConstructorTest() {
        DVD darkKnight = new DVD ("The Dark Knight", "2 hr. 32 mins.", "Superhero/Action", true);
        assertNotNull(darkKnight);
    }
    @Test
    public void dvdToStringTest() {
        DVD pirates = new DVD ("Pirates of the Caribbean", "2 hr. 23 mins.", "Action", true);
        assertEquals("Title: Pirates of the Caribbean, Duration: 2 hr. 23 mins., Genre: Action, NSC Collection: true", pirates.toString());
    }
    @Test
    public void dvdNullValuesTest() {
        assertThrows(NullPointerException.class, () -> new DVD(null, "Duration", "Genre", true));
        assertThrows(NullPointerException.class, () -> new DVD("Title", null, "Genre", true));
        assertThrows(NullPointerException.class, () -> new DVD("Title", "Duration", null, true));
    }

    // Magazine Testing
    @Test
    public void magAddTest() {
        magContainer.add(natGeo);
        magContainer.add(wired);
        magContainer.add(rollingStone);

        magContainer.display();
        System.out.println();
    }
    @Test
    public void magConstructorTest() {
        Magazine nintendoPwr = new Magazine("Nintendo Power", 150, 9, false);
        assertNotNull(nintendoPwr);
    }
    @Test
    public void magToStringTest() {
        Magazine guitarTech = new Magazine("Guitar Techniques", 140, 11, true);
        assertEquals("Title: Guitar Techniques, Issue Number: 140, Month: 11, NSC Collection: true", guitarTech.toString());
    }
    @Test
    public void magNotNullValuesTest() {
        assertThrows(NullPointerException.class, () -> new Magazine(null, 1,1,true));
    }

    // NSCMediaUtils Tests
    @Test
    public void NSCMediaUtilsTests() {
        NSCMediaUtils.printMediaDetails(charWeb);
        NSCMediaUtils.printMediaDetails(goonies);
        NSCMediaUtils.printMediaDetails(natGeo);
        System.out.println();
    }


}
