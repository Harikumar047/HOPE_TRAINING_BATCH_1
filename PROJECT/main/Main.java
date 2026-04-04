package main;

import manager.BlogManager;
import model.*;

public class Main {
    public static void main(String[] args) {

        Author author = new Author("Hari", "hari04@gmail.com");
        Reader reader = new Reader("kumar", "kumaru12@gmail.com");
        Admin admin = new Admin("Admin", "admin@blog.com");
        BlogManager manager = new BlogManager();

        // test 1 - write posts
        System.out.println(" Test 1: Write Posts :-");
        author.writePost("Java Basics", "Java is a language.");
        author.writePost("OOP Guide", "OOP has 4 pillars :");
        author.writePost("Encapsulation, Abstraction, Inheritance, and Polymorphism", "");
        author.writePost("", "empty title test");

        BlogPost p1 = author.getPost(0);
        BlogPost p2 = author.getPost(1);
        manager.add(p1);
        manager.add(p2);

        // test 2 - publish
        System.out.println("\n  Test 2: Publish :-");
        p1.publish();

        // test 3 - comment + validation
        System.out.println("\n  Test 3: Comment :-");
        reader.comment(p1, "Great post!");
        reader.comment(p1, "");

        // test 4 - extra feature: like
        System.out.println("\n Test 4: Like :-");
        p1.like(); p1.like();

        // test 5 - show post
        System.out.println("\n  Test 5: Show Post :-");
        p1.showPost();

        // test 6 - admin delete
        System.out.println("\n  Test 6: Admin Delete :-");
        admin.deletePost(p2, manager);
        manager.showAll();

        // test 7 - polymorphism
        System.out.println("\n  Test 7: Polymorphism :-");
        Person[] people = { author, reader, admin };
        for (Person p : people)
            System.out.println(p.getName() + " -> " + p.getRole());
    }
}