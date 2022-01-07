package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book myBook = new Book("MyBook");
        myBook.createPharagraph("Pharagraph 1");
        myBook.createPharagraph("Pharagraph 2");
        myBook.createPharagraph("Pharagraph 3");
        myBook.createImage("Image 1");
        myBook.createPharagraph("Pharagraph 4");
        myBook.createTable("Table 1");
        myBook.createPharagraph("Pharagraph 5");

        myBook.print();

    }
}
