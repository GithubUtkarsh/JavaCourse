package com.company;

class Library{
    String[] books;
    int no_of_books;
    Library(){
        books = new String[100];
        no_of_books = 0;
    }

    void AddBooks(String book){
        books[no_of_books]=book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void ShowAvailableBooks(){
        System.out.println("Available Books are:");
        for ( String book: books) {
            if(book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void IssueBook(String book){
        for(int i=0;i<books.length;i++){
            if(books[i].equals(book)){
                System.out.println("The book named "+"'"+ book+"'" +" been issued!");
                books[i]=null;
                return;
            }
        }
        System.out.println("This book does not exist!");
    }

    void ReturnBook(String book){
        AddBooks(book);
    }

}


public class Online_Library_Exercise4 {
    public static void main(String[] args) {
        Library CentralLibrary = new Library();
        CentralLibrary.AddBooks("Think and Grow Rich");
        CentralLibrary.AddBooks("Algorithm");
        CentralLibrary.AddBooks("C++");
        CentralLibrary.ShowAvailableBooks();
        CentralLibrary.IssueBook("C++");
        CentralLibrary.ShowAvailableBooks();
        CentralLibrary.ReturnBook("C++");
        CentralLibrary.ShowAvailableBooks();


    }
}
