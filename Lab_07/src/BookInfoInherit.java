// Declare a class called book having author_name as private data member.
// Extend book class to have two subclasses called book_publication & paper_publication.
// Each of these classes have private member called title.
// Write a complete program to show usage of dynamic method dispatch (dynamic polymorphism) to display
// book or paper publications of given author. Use command line arguments for input data. [A]

import java.util.Scanner;

class Book {

    private String author_name;

    public Book () {
    }

    public void setAuthor_name(String author_name){
        this.author_name = author_name;
    }

    public String getAuthor_name() {
        return author_name;
    }
}

class Book_Publication extends Book {

    private String title;

    public Book_Publication(String title) {
        this.title = title;
    }

    void displayPublication () {
        System.out.println("Book Published by the Given Author is => "+ this.title);
    }
}

class Paper_Publication extends Book {

    private String title;

    public Paper_Publication(String title) {
        this.title = title;
    }

    void displayPublication () {
        System.out.println("Paper Published by the Given Author is => "+ this.title);
    }
}

public class BookInfoInherit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the title of the book publication : ");
        Book_Publication bookPub1 = new Book_Publication(sc.nextLine());

        System.out.println();

        System.out.println("Enter the title of the paper publication : ");
        Paper_Publication paperPub1 = new Paper_Publication(sc.nextLine());

        System.out.println("Enter the Author name : ");
        bookPub1.setAuthor_name(sc.nextLine());

        sc.close();
    }
}
