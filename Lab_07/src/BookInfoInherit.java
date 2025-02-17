// Declare a class called book having author_name as private data member.
// Extend book class to have two subclasses called book_publication & paper_publication.
// Each of these classes have private member called title.
// Write a complete program to show usage of dynamic method dispatch (dynamic polymorphism) to display
// book or paper publications of given author. Use command line arguments for input data. [A]

class Book {

    private String author_name;

    public Book () {
    }
}

class Book_Publication extends Book {

    private String title;

    void displayPublication () {
        System.out.println("Book Published by the Given Author is => "+ this.title);
    }
}

class Paper_Publication extends Book {

    private String title;

    void displayPublication () {
        System.out.println("Paper Published by the Given Author is => "+ this.title);
    }
}

public class BookInfoInherit {

    public static void main(String[] args) {

    }
}
