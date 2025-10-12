package Assignment;

import java.util.Scanner;

//Outer class
public class LibrarySystem {
 
 // Inner class
 class Book {
     String title;
     String author;
     double price;
     
     // Constructor to initialize book details
     Book(String title, String author, double price) {
         this.title = title;
         this.author = author;
         this.price = price;
     }
     
     // Method to display book details
     void displayBookDetails() {
         System.out.println("\nBook Details:");
         System.out.println("Title: " + title);
         System.out.println("Author: " + author);
         System.out.println("Price: ₹" + price);
     }
 }
 
 // Method to add a new book
 void addBook() {
     Scanner sc = new Scanner(System.in);
     
     System.out.print("\nEnter Book Title: ");
     String title = sc.nextLine();
     
     System.out.print("Enter Author Name: ");
     String author = sc.nextLine();
     
     System.out.print("Enter Book Price: ");
     double price = sc.nextDouble();
     
     // Create a Book object
     Book newBook = new Book(title, author, price);
     
     // Display the book details
     newBook.displayBookDetails();
 }
 
 // Main method
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     LibrarySystem library = new LibrarySystem(); // Create Library object
     
     char choice;
     
     do {
         library.addBook(); // Add a book
         
         System.out.print("\nDo you want to add another book? (y/n): ");
         choice = sc.next().charAt(0);
         sc.nextLine(); // Clear the buffer
         
     } while (choice == 'y' || choice == 'Y');
     
     System.out.println("\nThank you for using the Library System!");
 }
}
