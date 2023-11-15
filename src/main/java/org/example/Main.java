package org.example;

public class Main {
    public static void main(String[] args) {

        Book firstBook = new Book("Siddhartha", "Herman Hesse", "984964694463", true);
        DVD firstDVD = new DVD("Life Aquatic with Steve Zissou", "1 hr. 45 mins.", "Comedy", true);
        Magazine firstMag = new Magazine("Nintendo Power", 150, 9, true);

        NSCLibraryMediaContainer mediaList = new NSCLibraryMediaContainer();

        mediaList.add(firstBook);
        mediaList.add(firstDVD);
        mediaList.add(firstMag);

        mediaList.display();
        mediaList.remove(firstMag);
        mediaList.display();

        System.out.println();

        NSCMediaUtils.printMediaDetails(firstBook);
        NSCMediaUtils.printMediaDetails(firstDVD);


    }
}